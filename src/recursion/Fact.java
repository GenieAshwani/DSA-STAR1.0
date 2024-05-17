package recursion;

public class Fact {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if(n==0) return 1;
        return n*factorial(n-1);
    }
}
