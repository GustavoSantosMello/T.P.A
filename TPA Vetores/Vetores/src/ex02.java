import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int[] A = new int[TAM];
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor A:");
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            System.out.println("\nTabuada do " + A[i] + ":");
            for (int x = 1; x <= 10; x++) {
                System.out.println(A[i] + " x " + x + " = " + (A[i] * x));
            }
        }
        ler.close();
    }
}