public class DP {
    public static int Fib(int n){
     if (n==0 ) {
        return 0;
     }
     if (n==1) {
        return 1 ;
     }
      return Fib(n-1) + Fib(n-2) ;
   
    }
    public static void main(String[] args) {
        int n = 5;
        // int f [] = new int [n+1];
        // Fib(n);
        System.out.println(Fib(n));
    }
}