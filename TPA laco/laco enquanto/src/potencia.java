import java.util.Scanner;
public class potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int expoente, i;
		double base, potencia;
		System.out.println("digite o expoente para o cálculo");
		expoente = ler.nextInt();
		System.out.println("digite a base para o cálculo");
		base = ler.nextDouble();
		potencia = 1;
		i = 0;
		while(i < expoente) {
			potencia = potencia*base;
			i++;
		}
		System.out.println("base "+ base + " ao expoente " + expoente + " resulta em " + potencia);
	}
}
