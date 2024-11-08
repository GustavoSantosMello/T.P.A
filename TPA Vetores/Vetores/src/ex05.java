import java.util.Scanner;
public class ex05 {
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
            System.out.print("Divisores de " + numero + ": ");
            
            for (int x = 1; x <= numero; x++) {
                if (numero % x == 0) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
        ler.close();
    }
}