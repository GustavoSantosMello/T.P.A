import java.util.Scanner;
public class Exercicio_14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int i, a[], b[], c[];
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " + (i+1) + " valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " + (i+1) + " valor do vetor B");
			b[i] = ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			}
			if(a[i] == b[i]) {
				c[i] = 0;
			}
			if(a[i] < b[i]) {
				c[i] = -1;
			}
		}
		 System.out.print("\nC = ");
			for(i=0; i<TAM; i++) {
				System.out.print(c[i] +", ");
			}
		
	}

}
