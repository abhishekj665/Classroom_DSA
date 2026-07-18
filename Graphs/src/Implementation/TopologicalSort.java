package Implementation;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    static class Edge{
        int src;
        int des;

        public Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){


        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topSort(ArrayList<Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < graph.length; i++){
            if(!visit[i]){
                topSortUtil(graph, i, visit, s);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visit, Stack<Integer> s){
        visit[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.des]){
                topSortUtil(graph, e.des, visit, s);
            }
        }

        s.push(curr);
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[6];

        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        createGraph(graph);
        topSort(graph);
    }
}
