import java.util.Scanner;

public class DigitExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int count =0;
        while(count<3){
            int temp = n;
            if(count == 0) {
                temp/=100 ;
                count++;
                System.out.println("Hundreds: "+temp);
            } else if(count==1){
                temp = temp/10;
                temp = temp %10;
                count++;
                System.out.println("Tens: "+temp);
            }
            else if(count==2){
                temp=temp%10;
                count++;
                System.out.println("Ones: "+temp);
            }}
    }
}
/*
        System.out.println("Hundreds: " + (n / 100));
        System.out.println("Tens: " + ((n / 10) % 10));
        System.out.println("Ones: " + (n % 10));
    }
}*/
