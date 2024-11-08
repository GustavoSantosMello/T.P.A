import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 20;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int posiç = 0;
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " valor do vetor A:");
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            if (A[i] % 2 == 0) {
                B[posiç] = A[i];
                posiç++;
            }
        }
        for (int i = 0; i < TAM; i++) {
            if (A[i] % 2 != 0) {
                B[posiç] = A[i];
                posiç++;
            }
        }
        System.out.print("a[ ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]\n");
        
        System.out.print("b[ ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("]\n");
 
        ler.close();
    }
}