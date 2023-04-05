import java.util.Scanner;

public class 1048 {

    public static void main(String[] args) {
        float salin = 0;
        double salfin = 0, rea = 0;
        int perc = 0;
        Scanner ler = new Scanner(System.in);
            salin = ler.nextFloat();       
        if (salin <= 400.0) {
            perc = 15;
            rea = salin * 0.15;
            salfin = salin + rea;
        } else if (salin <= 800) {
            perc = 12;
            rea = salin * 0.12;
            salfin = salin + rea;

        } else if (salin <= 1200) {
            perc = 10;
            rea = salin * 0.10;
            salfin = salin + rea;
        } else if (salin <= 2000) {
            perc = 7;
            rea = salin * 0.07;
            salfin = salin + rea;
        } else if (salin > 2000) {
            perc = 4;
            rea = salin * 0.04;
            salfin = salin + rea;
        }


        System.out.printf("Novo salario: %.2f\n", salfin);
        System.out.printf("Reajuste ganho: %.2f\n", rea);
        System.out.println("Em percentual: " + String.valueOf(perc)+ " %");
    }
}
