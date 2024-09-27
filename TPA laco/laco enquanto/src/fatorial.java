import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a, vezes, resultado;
		System.out.println("digite o numero que deseja o valor fatorial");
		a = ler.nextInt();
		vezes = a;
		resultado = 1;
		while(vezes > 1) {
			resultado = resultado*vezes;
			vezes--;
		}
		System.out.println("o valor fatorial de " + a + " é " + resultado);
	}
}
