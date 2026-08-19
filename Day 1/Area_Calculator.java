import java.util.Scanner;

public class Area_Calculator  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine().trim();
        Double area=0.00;
        // Read measurements and calculate area
        if(shape.equals("rectangle")){
            Double width = sc.nextDouble();
            Double height = sc.nextDouble();
            area = width*height;
        }
        else if(shape.equals("triangle")){
            Double base = sc.nextDouble();
            Double height=sc.nextDouble();
            area = base * height/2;
        }
        else{
            Double radius = sc.nextDouble();
            area = Math.PI*radius*radius;
        }
        System.out.printf("Area: %.2f",area);
        // Print the area
    }
}

