import java.util.Scanner;
public class Media {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int nI, nF, soma, i = 0, media = 0;
		System.out.println("Digite o numero inicial");
		nI = ler.nextInt();
		System.out.println("Digite o numero final");
		nF = ler.nextInt();
		i = nI;
		soma = 0;
		while (i <= nF) {
			soma = soma + i;
			i++;
		}
		media = soma/i;
		System.out.println("A média aritmetica de "+ nI + " e "+ nF + " é de " + media);
	}
 
}