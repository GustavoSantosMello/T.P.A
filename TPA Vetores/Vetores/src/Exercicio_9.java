import java.util.Scanner;
public class Exercicio_9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int i, a[], b[], c[];
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+ (i+1) +" valor do vetor A");
			a[i] = ler.nextInt();
		}
		System.out.println("------------------------------------");
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+ (i+1) +" valor do vetor B");
			b[i] = ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
			if(c[i]/2 == 1) {
				c[i] = a[i];
			}
		}
		for(i=0; i<TAM; i++) {
			if(c[i]/2 == 0) {
				c[i] = b[i];
			}
		}
		System.out.print("C = ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i] +", ");
		}
		System.out.print("]");
	}
}