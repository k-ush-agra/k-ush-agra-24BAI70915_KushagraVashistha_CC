class Solution {
    public int[] shortestPath(int V, int[][] edges, int src) {
        
       
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); 
        }

       
        int[] dist = new int[V];
        Arrays.fill(dist, -1);

       
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : adj.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    q.add(neighbor);
                }
            }
        }

        return dist;
    }
}