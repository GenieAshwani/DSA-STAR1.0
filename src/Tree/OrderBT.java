package Tree;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.Queue;

public class OrderBT {
    //10 11 12
    //11 13 14
    //12 15 16
    public static void main(String[] args) {

        Tree root = createTree();
        System.out.print("Preorder: ");

        preOrder(root);
        System.out.println();
        System.out.print("Postorder: ");

        postOrder(root);
        System.out.println();
        System.out.print("Inorder: ");
        inOrder(root);

        System.out.println("BFS:");
        bfs(root);
    }

    public static void bfs(Tree root)
    {
        Queue<Tree> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Tree node= queue.poll();
            System.out.print(node.data+",");
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
    }

    public static void preOrder(Tree root)
    {
        if(root==null) return;
        System.out.print(root.data+", ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Tree root)
    {
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+", ");
    }
    public static void inOrder(Tree root)
    {
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.data+", ");
        inOrder(root.right);

    }



    public static Tree createTree()
    {
        Tree root=new Tree(10);
        root.left=new Tree(11);
        root.right=new Tree(12);

        root.left.left=new Tree(13);
        root.left.right=new Tree(14);

        root.right.left=new Tree(15);
        root.right.right=new Tree(16);
        return root;
    }
}
