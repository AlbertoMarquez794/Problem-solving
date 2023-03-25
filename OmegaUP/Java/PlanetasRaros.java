import java.util.*;

public class PlanetasRaros {

    public static String dameHora(int s){
        StringBuilder cad = new StringBuilder();

        for (int i = 0; i < 4; i++){
            switch (i){
                case 0: //Dias
                    if (s >= 42000){
                        cad.append(s/42000).append(" ");
                        s = (s%42000);
                    }
                    else{
                        cad.append("0 ");
                    }
                break;
                case 1: //Horas
                    if (s >= 3500){
                        cad.append(s/3500).append(" ");;
                        s = (s%3500);
                    }
                    else{
                        cad.append("0 ");
                    }
                break;
                case 2:
                    if (s >= 50){
                        cad.append(s/50).append(" ");;
                        s =(s%50);
                    }
                    else{
                        cad.append("0 ");
                    }
                break;
                default:
                    cad.append(s);
                break;
            }
        }
        return cad.toString();
    }

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int n = lec.nextInt();
        System.out.println(dameHora(n));
    }
    
}
