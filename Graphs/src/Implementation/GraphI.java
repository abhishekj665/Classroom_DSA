package Implementation;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.*;

public class GraphI {

    static class Edge{
        int s;
        int d;
        int w;

        public Edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    static void bFS(ArrayList<Edge>[] graph){

        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[graph.length];

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");
            for(Edge e : graph[curr]){
                if(!visited[e.d]){
                    q.add(e.d);
                    visited[e.d] = true;
                }
            }
        }
    }

    static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited){

        System.out.print(curr + " ");

        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.d]){
                dfs(graph, e.d, visited);
            }
        }
    }

    static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        if(src == dest){
            return true;
        }

        visited[src] = true;

        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visited[e.d] && hasPath(graph, e.d, dest, visited)){
                return true;
            }
        }

        return false;
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){

        boolean[] visited = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                if(detectCycleUtil(graph, visited, i, -1)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int par){

        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            //case 3
            if(!visited[e.d]){
                if(detectCycleUtil(graph, visited, e.d, curr )){
                    return true;
                }

            }
            //case 1
            else if (visited[e.d] && e.d != par) {
                return true;
            }

            //case 2 - do nothing

        }

        return false;
    }

    static void addEdge(ArrayList<Edge>[] graph, int s, int d, int w) {
        graph[s].add(new Edge(s, d, w));
        graph[d].add(new Edge(d, s, w));
    }


    public static void main(String[] args) {

        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[ v];

        for(int i = 0; i < v; i++){
            graph[i] = new ArrayList<>();
        }

        boolean[] visited = new boolean[graph.length];

        addEdge(graph, 0, 1, 5);
        addEdge(graph, 1, 2, 1);
        addEdge(graph, 2, 4, 5);
        addEdge(graph, 3, 1, 3);

        System.out.println(detectCycle(graph));
    }

}
