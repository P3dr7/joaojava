public class SomaDigitosRecursivo {

    public static void main(String[] args) {
        float salin;
        double salfin = 0, perc = 0, rea = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe o salario inicial");
        salin = ler.nextFloat();
        if (salin < 400.0) {
            perc = 15;
            rea = salin * 0.15;
            salfin = salin + rea;
        } else if (salin > 400 && salin < 800) {
            perc = 12;
            rea = salin * 0.12;
            salfin = salin + rea;

        } else if (salin > 800 && salin < 1200) {
            perc = 10;
            rea = salin * 0.10;
            salfin = salin + rea;
        } else if (salin > 1200 && salin < 1800) {
            perc = 7;
            rea = salin * 0.07;
            salfin = salin + rea;
        } else if (salin > 1800) {
            perc = 4;
            rea = salin * 0.04;
            salfin = salin + rea;
        }


        System.out.printf("Novo salario: " + salfin);
        System.out.printf("Reajuste ganho: " + rea);
        System.out.printf("Em percentual: " + perc + "%");
    }
}
