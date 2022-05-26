package teste;
public class testeprimo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            if( ehPrimo(i) ) {
                count += 1;
                System.out.println(i + " --> é primo. " + count);
            } else {
                System.out.println(i + " --> Não é primo");
            }
        }
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}

/*            if ((i % 2 == 0) && (i != 2))
                    System.out.println(i + " --> Não é primo");*/