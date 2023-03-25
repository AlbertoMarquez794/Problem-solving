import java.util.Scanner;

public class Minutos{

    
   public static int convierte(int n){
        return n*60;
   }

   public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int n = lec.nextInt();
        System.out.println(convierte(n));
   }

}