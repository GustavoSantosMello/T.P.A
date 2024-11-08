import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor A:");
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elementos pares até " + A[i] + ": ");
            
            for (int x = 0; x <= A[i]; x++) {
                if (x % 2 == 0) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
        ler.close();
    }
}