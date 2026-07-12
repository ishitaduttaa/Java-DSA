package Loops;

public class que_3 {
    static void main(String[] args) {
        int n = 9823;
        int rev = 0;
        while(n!=0){
            rev*=10;
            rev = rev + (n%10);
            n=n/10;
        }
        System.out.println(rev);
    }
}
