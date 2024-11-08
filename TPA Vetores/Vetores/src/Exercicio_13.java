import java.util.Scanner;
public class Exercicio_13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " + (i+1) + " valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=0; i<10; i++) {
			if(a[i]%2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
			}
		}                                                    
		System.out.println("----------------------------------------");
		System.out.print("\nOs valores de A em par e ímpar são: [");
        for (i = 0; i < TAM; i++) {
            System.out.print(", " + b[i]);
        }
		System.out.print(" ]");
		System.out.println("\nCom 1 sendo os numeros pares e 0 os numeros ímpares");
	}

}
