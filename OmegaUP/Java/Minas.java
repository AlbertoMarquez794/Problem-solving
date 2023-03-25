import java.util.Scanner;

public class Minas {
    
    public static void minasAlredor (int n, int m, int [][] mat){
        int [][] matBombas = new int[n][m];

        for (int i=0; i < n; i++){
            for (int j=0; j < m; j++){
                if (mat[i][j] == 1){
                    for (int k = Math.max(0, i - 1); k <= Math.min(n - 1, i + 1); k++) {
                        for (int l = Math.max(0, j - 1); l <= Math.min(m - 1, j + 1); l++) {
                            matBombas[k][l]++;
                        }
                    }
                }
            }
        }

        for (int i=0; i < n; i++){
            for (int j=0; j < m; j++){
                System.out.print(matBombas[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][] max = new int[n][m];
        for (int i=0; i < n; i++){
            for (int j=0; j < m; j++){
                max[i][j] = sc.nextInt();
            }
        }
        minasAlredor(n,m,max);
    }
}