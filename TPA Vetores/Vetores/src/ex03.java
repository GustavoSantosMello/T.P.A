import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor A:");
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            int numero = A[i];
            boolean primo = true;
            
            if (numero <= 1) {
                primo = false;
            } else {
                for (int x = 2; x <= Math.sqrt(numero); x++) {
                    if (numero % x == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }
        ler.close();
    }
}