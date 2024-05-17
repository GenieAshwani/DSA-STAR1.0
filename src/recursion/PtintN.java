package recursion;

public class PtintN {

    public static void main(String[] args) {

        print3(5);
    }

    //doing work before building stack
    public static void print(int n)
    {
        if(n==0) return; //base case
        System.out.println(n);
        print(n-1);  //tail recursion

    }

    //doing work after removing stack
    public static void printN(int n)
    {
        if(n==0) return; //base case
        printN(n-1);  //head recursion
        //5-4-3-2-1
        System.out.println(n);
    }

    public static void print3(int n)
    {
        if(n==0) return;
        if(n%2==1) System.out.println(n);
        print3(n-1);
        if(n%2==0) System.out.println(n);
    }
}
