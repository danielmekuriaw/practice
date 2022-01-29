class Solution {
    
    private List<List<Integer>> edges; 
    private boolean[] visited;
    
    private boolean[] onPath;
    private boolean hasCycle;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];
        
        edges = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            edges.get(edge[1]).add(edge[0]);
        }
        
        for (int i = 0; i < numCourses; i++) {
            dfs(i);
        }
        return !hasCycle;
        
    }
    
    public void dfs(int s) {
        if (onPath[s]) {
            hasCycle = true;
            return;
        }
        if (visited[s]) return;
        visited[s] = true;
        onPath[s] = true;
        for (int i = 0; i < edges.get(s).size(); i++) {
            dfs(edges.get(s).get(i));
        }
        onPath[s] = false;
    }
}