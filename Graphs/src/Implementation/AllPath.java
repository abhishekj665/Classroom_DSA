package Implementation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AllPath {

    static class Edge{
        int src;
        int des;

        public Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void findPath(ArrayList<Edge>[] graph, int src, int target,String path){

        if(src == target){
            System.out.print(src + " " + target);
            return;
        }

        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            findPath(graph, e.des, target, path+src);
        }


    }

    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[6];



        for(int i = 0; i < graph.length; i++){
            graph[i] =  new ArrayList<>();
        }

        createGraph(graph);

        findPath(graph, 5, 1, "");
    }
}
