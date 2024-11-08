import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 15;
        int[] A = new int[TAM];
        long[] B = new long[TAM];  
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor A:");
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            long fatorial = 1;
            for (int x = 1; x <= A[i]; x++) {
                fatorial *= x;  
            }
            B[i] = fatorial;
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
 
        System.out.print("Vetor B (fatoriais): ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
 
        ler.close();
    }
}