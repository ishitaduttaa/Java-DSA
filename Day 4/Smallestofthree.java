
import java.util.Scanner;

public class Smallestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());
        int c = Integer.parseInt(sc.nextLine().trim());
        int d =0;
        if(a<b & a<c){
            d = a;
        }
        else if(b<a &b<c){ d=b;}
        else if(c<a & c<b){d=c;}
        System.out.println("Smallest: "+d);
    }
}
