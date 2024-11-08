import java.util.Scanner;
public class Exercicio_12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int i=0, a[], p=1;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+ (i+1) +" valor do vetor A");
			a[i] = ler.nextInt();
		}
			if(a[0] == a[9] && a[1] == a[8] && a[2] == a[7] && a[3] == a[6] && a[4] == a[5]) {
				System.out.println("O vetor é um palindromo");
			} else {
				System.out.println("O vetor não é um palindromo");
		}
	}
}