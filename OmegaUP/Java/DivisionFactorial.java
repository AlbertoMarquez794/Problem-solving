import java.util.Scanner;

public class DivisionFactorial {
    public static int divisionFact(int n, int m) {
        int result = 1;
        for (int i = m + 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, resultado;
        n = sc.nextInt();
        m = sc.nextInt();

        resultado = divisionFact(n, m);

        System.out.println(resultado);
    }
}
