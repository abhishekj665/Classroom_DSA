package Questions;

import java.util.PriorityQueue;

import java.util.*;

public class ConnectingCities {

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static int findMinCost(int[][] edges, int n) {

        // Step 1: Build adjacency list
        ArrayList<Pair>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            int u = e[0] - 1;  // convert 1-based to 0-based
            int v = e[1] - 1;
            int cost = e[2];

            graph[u].add(new Pair(v, cost));
            graph[v].add(new Pair(u, cost));
        }

        // Step 2: Prim's MST
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visit = new boolean[n];

        pq.add(new Pair(0, 0)); // start from city 0
        int mstCost = 0;
        int edgesUsed = 0;

        while (!pq.isEmpty() && edgesUsed < n) {
            Pair curr = pq.poll();

            if (!visit[curr.v]) {
                visit[curr.v] = true;
                mstCost += curr.cost;
                edgesUsed++;

                for (Pair nei : graph[curr.v]) {
                    if (!visit[nei.v]) {
                        pq.add(nei);
                    }
                }
            }
        }

        return mstCost;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 1},
                {1, 3, 2},
                {1, 4, 3},
                {1, 5, 4},
                {2, 3, 5},
                {2, 5, 7},
                {3, 4, 6}
        };

        int n = 5;
        System.out.println(findMinCost(arr, n));
    }
}
