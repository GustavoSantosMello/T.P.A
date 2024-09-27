import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tabuada, resultado,vezes;
		resultado = 0;
		tabuada = 0;
		vezes = 0;
		while(vezes <= 10 & tabuada <= 10) {
			vezes++;
			resultado = tabuada*vezes;
			System.out.println(tabuada + " vezes " + vezes + " é igual a " + resultado);
		if(vezes == 10) {
			tabuada++;
			vezes = 0;
		}
		}
	}
}
