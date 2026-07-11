package Recursion;
//7. Sum of first N natural numbers
//8. Product of first N natural numbers
public class recursion_7_and_8 {
    static int sum(int n) {
        if (n == 0) return 0;
        int count = sum(n - 1)+n; //sum
        System.out.println(n);
        return count;
    }
    static int product(int n){
        if(n==0) return 1;
        return product(n-1)*n; //product
    }

    static void main(String[] args) {
        int n=7;
        System.out.println(sum(n));
        int a = product(n);
        System.out.println(a);
    }
}
