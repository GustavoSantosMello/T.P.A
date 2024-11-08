
public class ex06 {
    public static void main(String[] args) {
        final int TAM = 11;
        int[] A = new int[TAM];
        
        for (int i = 0; i < TAM; i++) {
            A[i] = (int) Math.pow(2, i);  
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}