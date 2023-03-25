import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String letter = input[0];
        int number = Integer.parseInt(input[1]);

        String[] c1 = {"a", "c", "e", "g"};
        String[] c2 = {"b", "d", "f", "h"};

        if (inArray(letter, c1)) {
            if (number % 2 == 0) {
                System.out.println("BLANCO");
            } else {
                System.out.println("NEGRO");
            }
        } else if (number % 2 == 0) {
            System.out.println("NEGRO");
        } else {
            System.out.println("BLANCO");
        }
    }

    public static boolean inArray(String targetValue, String[] arr) {
        for(String s: arr){
            if(s.equals(targetValue))
                return true;
        }
        return false;
    }
}