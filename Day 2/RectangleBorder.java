import java.util.Scanner;

public class RectangleBorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine().trim());
        int height = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<height;i++){
            if(i==0 || i==(height-1)) {
                for(int j=0;j<width;j++){
                    System.out.print("*");
                }}
            else{
                for(int j=0;j<width;j++){
                    if(j==0 || j==(width-1)) System.out.print("*");
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
