/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

/**
 *
 * @author marqu
 */
public class Xornacci {
    public static int xornacci(int a, int b, int n){
        switch (n%3) {
            case 0:
                return a;
            case 1:
                return b;
            default:
                return a^b;
        }
    }
    
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int t = lec.nextInt();
        int a,b,n;
        while(t > 0){
            a = lec.nextInt();
            b = lec.nextInt();
            n = lec.nextInt();
            System.out.println(xornacci(a,b,n));
            t--;
        }
    }
}
