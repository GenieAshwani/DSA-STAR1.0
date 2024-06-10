package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateTree {
    public static void main(String[] args) {
        int n=4;
        int left[]={1,-1,3,-1};
        int rigt[]={2,-1,-1,-1};
        boolean res= validateBinaryTreeNodes(n,left,rigt);
        System.out.println(res);
    }

        public static boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {

            int[] indegree = new int[n];
            for (int i = 0; i < n; i++) {
                if (leftChild[i] != -1)
                    indegree[leftChild[i]]++;
                if (rightChild[i] != -1)
                    indegree[rightChild[i]]++;
            }
            int root = -1;
            for (int i = 0; i < n; i++) {
                if (indegree[i] == 0)
                    root = i;
            }
            if (root == -1)
                return false;
            boolean[] visited = new boolean[n];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int node = queue.poll();
                if (visited[node])
                    return false;
                visited[node] = true;
                if (leftChild[node] != -1)
                    queue.add(leftChild[node]);
                if (rightChild[node] != -1)
                    queue.add(rightChild[node]);
            }
            int trueCount = 0;
            for (boolean b : visited) {
                if (b)
                    trueCount++;
            }
            return trueCount == n;
        }

}
