import java.util.Scanner;
public class Exercicio_11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], x=0, i, s=0;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " + (i+1) + " valor do vetor A");
				a[i] = ler.nextInt();
		}
		System.out.println("Digite o elemento que deseja encontrar.");
			x = ler.nextInt();
		for(i=0; i<TAM; i++) {
		if(a[i] == x) {
			s++;
		}
		}
		if(s==1) {
			System.out.println("Elemento " + x + "encontrado no Vetor!");
		} else {
			System.out.println("Elemento " + x + " não encontrado no Vetor!");
		}
	}
}
