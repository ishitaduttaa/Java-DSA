import java.util.Scanner;
public class VotingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine().trim());
        if(age>=18) {
            System.out.println(name+" can vote");}
        else{
            System.out.println(name+" cannot vote");	}
        // Check and print
    }
}
