import java.util.Scanner;
public class Exercicio_8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i, j;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " + (i+1) + " valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
	        b[i] = 0;
	        for (j = i; j < TAM; j++) {
	        b[i] += a[j]; 
	            }
	        }
		System.out.println("B[");
        for (i = 0; i < TAM; i++) {
            System.out.print(" " + b[i]);
        }
		System.out.print(" ]");
		
		
	}

}
