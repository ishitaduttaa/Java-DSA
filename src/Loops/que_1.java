package Loops;

import java.util.Scanner;

//count digits of a no. 3223
public class que_1 {
    static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
         int n = sc.nextInt();
         int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
//        for(int i = n;i!=0;i=i/10){
//            count++;
//            System.out.println(i);
//        }
        System.out.println(count);
    }
}
