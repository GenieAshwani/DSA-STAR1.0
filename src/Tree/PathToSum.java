package Tree;

import java.util.ArrayList;

public class PathToSum {

    static ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.left = new Tree(28);
        root.right = new Tree(13);

        root.right.left = new Tree(14);
        root.right.right = new Tree(15);

        root.right.left.left = new Tree(21);
        root.right.left.right = new Tree(22);

        root.right.right.left = new Tree(23);
        root.right.right.right = new Tree(24);
        printPaths(root,38,0,new ArrayList<>());
        System.out.println(res);
    }

    public static void printPaths(Tree root, int sum,int cm,ArrayList<Integer> temp)
    {
        // code here
        if(root==null) return;
        cm+=root.data;
        temp.add(root.data);
        if(cm==sum)
        {
            res.add(temp);
        }

        printPaths(root.left,sum,cm,temp);
        printPaths(root.right,sum,cm,temp);
        temp.remove(temp.size()-1);

    }
}
