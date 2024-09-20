import java.util.Scanner;
public class Nota {
	public static void main (String args[]) {
		Scanner ler= new Scanner(System.in);
		double n1, n2, media;
		System.out.println ("Digite a primeira nota");
		n1= ler.nextDouble();
		System.out.println ("Digite a segunda nota");
		n2= ler.nextDouble();
		media=(n1+n2)/2;
		System.out.println("a media é "+media);
		
	}

}
