package DijkstraAlgorithm;

import java.util.*;

public class Dijkstra {

    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair>{
        int node;
        int path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        int[] dist = new int[graph.length];

        for(int i = 0; i < graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        boolean[] visit = new boolean[graph.length];

        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!visit[curr.node]){
                visit[curr.node] = true;
                for(Edge e : graph[curr.node]){
                    int v = e.des;
                    int newDis = dist[curr.node] + e.wt;

                    if(newDis < dist[v]){
                        dist[v] = newDis;
                        pq.add(new Pair(v , newDis));
                    }
                }
            }
            }

        for(int i = 0; i < dist.length; i++){
            System.out.println("Shortest distance from " + src + " to " + i + " is " + dist[i]);
        }



    }

    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[6];

        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        createGraph(graph);

        dijkstra(graph, 0);

    }
}
