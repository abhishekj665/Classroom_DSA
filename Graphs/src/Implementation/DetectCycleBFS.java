package Implementation;

import java.util.*;

public class DetectCycleBFS {

    static class Edge{
        int des;
        int src;

        public Edge(int src, int des){
            this.src = src;
            this.des = des;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        // This graph has a cycle
    }

        public static boolean detectCycle(ArrayList<Edge>[] graph){

        boolean[] visited  = new boolean[graph.length];



        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                if(detectCycleUtil(graph, i, visited)){
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited){

        Queue<int[]> q = new LinkedList<>();
        visited[curr] = true;

        q.add(new int[]{curr, -1});

        while(!q.isEmpty()){
            int[] pair = q.remove();
            int node = pair[0];
            int par = pair[1];

            for(Edge e : graph[node]){
                if(!visited[e.des]){
                    visited[e.des] = true;
                    q.add(new int[]{e.des, node});
                } else if (e.des != par) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        System.out.println(detectCycle(graph));

    }
}
