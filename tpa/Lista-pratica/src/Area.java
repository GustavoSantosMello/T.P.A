import java.util.Scanner;
public class Area {	
	public static void main (String args []) {
		Scanner ler=new Scanner(System.in);
		int base, h, area;
		System.out.println("Coloque a base do seu triangulo");
		base= ler.nextInt();
		System.out.println("coloque a altura do seu triangulo: ");
		h= ler.nextInt();
		area=(base*h)/2;
		System.out.println("A sua base é :" + area);
	}

}
