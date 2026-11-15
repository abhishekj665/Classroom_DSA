package Graph;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.*;

public class Graph {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest, int wt){
        graph[src].add(new Edge(src, dest, wt));
        graph[dest].add(new Edge(dest, src, wt));
    }

    public static void dfsTraversal(ArrayList<Edge>[] graph, int curr, boolean[] visited){
//        System.out.print(curr + " ");

        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Graph.Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfsTraversal(graph, e.dest, visited);
            }
        }
    }

    static class Pair implements Comparable<Pair>{
        int path;
        int node;

        public Pair(int node, int path){
            this.path = path;
            this.node = node;

        }

        @Override
        public int compareTo(@NotNull Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void bfsTraversal(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ") ;
            for(Edge e : graph[curr]){
                if(!visited[e.dest]){
                    q.add(e.dest);
                    visited[e.dest] = true;

                }
            }
        }

    }

    public static void krushKalAlgo(ArrayList<Edge>[] graph, int src){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
    }

    public static void dijkstraAlgo(ArrayList<Edge>[] graph, int src){
        int[] distance = new int[graph.length];
        boolean[] visited = new boolean[graph.length];

        Arrays.fill(distance, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        distance[src] = 0;

        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if (visited[curr.node]) {
                continue;
            }

            visited[curr.node] = true;

            for (Edge e : graph[curr.node]) {
                int newDistance = distance[curr.node] + e.wt;

                if (newDistance < distance[e.dest]) {
                    distance[e.dest] = newDistance;
                    pq.add(new Pair(e.dest, newDistance));
                }
            }
        }

        for(int i = 0; i < distance.length; i++){
            System.out.println("Source " + src + " to " + i + " sortest path " + distance[i]);
        }
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        Queue<Pair> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(new Pair(0, -1));
        visited[0] = true;
        while(!q.isEmpty()){
            int node = q.peek().node;
            int parent = q.peek().path;
            q.poll();
            for(Edge e : graph[node]){
                int neigh = e.dest;
                if(!visited[neigh]){
                    visited[neigh] = true;
                    q.add(new Pair(neigh, node));
                }else if(neigh != parent){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean detectCycleDFS(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                if(detectCycleUtil(graph, i, -1, visited)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, int parent, boolean[] visited){
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                if(detectCycleUtil(graph, e.dest, curr, visited)){
                    return true;
                }
            }

            else if(visited[e.dest] && e.dest != parent){
               return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int v = 8;
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i = 0; i < v; i++){
            graph[i] = new ArrayList<>();
        }
        addEdge(graph,0, 1, 2);

        addEdge(graph, 1, 3, 1);
        addEdge(graph, 1, 2, 2);
        addEdge(graph, 2, 5, 2);
        addEdge(graph, 3, 4, 5);
        addEdge(graph, 3, 6, 6);
        addEdge(graph, 6, 7, 4);
        addEdge(graph, 7, 5, 4);

        boolean[] visited = new boolean[v];
        int provinces = 0;


        for(int i = 0; i < v; i++){
            if(!visited[i]){
                dfsTraversal(graph, i, visited);
                provinces++;
            }
        }

        System.out.println(provinces);

        bfsTraversal(graph);

        System.out.println(detectCycle(graph));

        System.out.println(detectCycleDFS(graph));
    }
}
