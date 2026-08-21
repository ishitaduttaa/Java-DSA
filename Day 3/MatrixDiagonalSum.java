import java.util.Scanner;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split(" ");
            for (int j = 0; j < n; j++) matrix[i][j] = Integer.parseInt(parts[j]);
        }
        int sum = 0;
        int dia = 0;
        int save = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) {sum+= matrix[i][j];}
                if((n-1)==i+j) {dia += matrix[j][i]; }
                if(n%2!=0 & (n/2 ==i & n/2 ==j)) {save = matrix[i][j];}
            }}

        if(n%2!=0) {
            int finall = sum+dia - save;
            System.out.print(finall);
        }
        else {
            int finall = sum+dia;
            System.out.print(finall);
        }
    }
}
