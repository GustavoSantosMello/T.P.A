import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
 
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
 
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor A:");
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            B[i] = A[i];
            C[i] = A[i];
        }
        for (int i = 0; i < TAM - 1; i++) {
            for (int j = 0; j < TAM - 1 - i; j++) {
                if (B[j] > B[j + 1]) {
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                }
            }
        }
 
        for (int i = 0; i < TAM - 1; i++) {
            for (int j = 0; j < TAM - 1 - i; j++) {
                if (C[j] < C[j + 1]) {
                    int temp = C[j];
                    C[j] = C[j + 1];
                    C[j + 1] = temp;
                }
            }
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
 
        System.out.print("Vetor B (ordem crescente): ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
 
        System.out.print("Vetor C (ordem decrescente): ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
 
        ler.close();
    }
}
//FINALMENTE PRONTO!