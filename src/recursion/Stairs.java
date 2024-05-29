package recursion;

public class Stairs {
    public static void main(String[] args) {
        int n=3;
        int res=helper(n);
        System.out.println(res);
    }

     static int helper(int n) {
         if (n < 0) return 0;
         if (n == 0) return 1;
        /*int one=helper(n-1);
        int two=helper(n-2);*/
         return helper(n - 1) + helper(n - 2);
     }
}
