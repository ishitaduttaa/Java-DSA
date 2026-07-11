package Recursion;
//9. Nth Fibonacci number
//10. Power (xⁿ)
public class recursion_9_and_10 {
    static int fibo(int n){
        if(n<=0) return 0;
        else if (n==1 || n==2) return 1;
        int count = fibo(n-1) + fibo(n-2); //fibo
        return count;
    }

    static int power(int n){
        int x = 7;
        if (n==0) return 1;
        return x * power(n-1); //power
    }

    static void main(String[] args) {
        int n = 3;
        System.out.println(power(n));
        int a = fibo(n);
        System.out.println(a);
    }
}
