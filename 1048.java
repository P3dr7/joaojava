public class 1048{
    import java.util.Scanner;
    public static void main(String[] args) {
    float salin;
    int salfin = 0, perc = 0, rea = 0;
    Scanner ler =  new Scanner;
    System.out.println(“Informe o Salário inicial”);
    salin = ler.nextDouble();
    switch (salin){
        case (salin < 400){
            perc = 15;
            salin * 0.15 = rea;
            salfin = salin + rea;
        }
        case (salin > 400 && salin < 800){
            perc = 12;
            salin * 0.12 = rea;
            salfin = salin + rea;
        }
        case (salin > 800 && salin < 1200){
            perc = 10;
            salin * 0.10 = rea;
            salfin = salin + rea;
        }
        case (salin > 1200 && salin < 1800){
            perc = 7;
            salin * 0.07 = rea;
            salfin = salin + rea;
        }
        case (salin > 1800){
            perc = 4;
            salin * 0.04 = rea;
            salfin = salin + rea;
        }
        }
        System.out.printf("Novo salario: " + salfin);
        System.out.printf("Reajuste ganho: " + rea);
        System.out.printf("Em percentual: " + perc + "%");
    } 
}