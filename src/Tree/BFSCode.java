package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSCode {
    public static void main(String[] args) {
        Tree root=new Tree(1);
        root.left=new Tree(2);
        root.right=new Tree(3);
        root.left.left=new Tree(4);
        root.left.right=new Tree(5);
        root.right.left=new Tree(6);
        root.right.right=new Tree(7);
        ArrayList<Integer> res=bfs(root);
        System.out.println(res);
    }

    public static   ArrayList<Integer> bfs(Tree root)
    {
        Queue<Tree> queue=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Tree node=queue.poll();
            res.add(node.data);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }

        return res;
    }
}
