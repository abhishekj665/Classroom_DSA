package Implementation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortBFS {

    static class Edge{
        int src;
        int dst;

        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
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

    public static void calIndegree(ArrayList<Edge>[] graph, int[] inDegree){
        for(int i = 0; i < graph.length; i++){
            int vertex = i;
            for(int j = 0; j < graph[vertex].size(); j++){
                Edge e = graph[vertex].get(j);
                inDegree[e.dst]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph){
        int[] inDegree = new int[graph.length];
        calIndegree(graph, inDegree);
        Queue<Integer> q= new LinkedList<>();

        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDegree[e.dst]--;
                if(inDegree[e.dst] == 0){
                    q.add(e.dst);
                }
            }
        }

        System.out.println();

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
