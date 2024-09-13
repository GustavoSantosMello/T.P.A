import java.util.Scanner;
public class peso_ideal {
 public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	String sexo;
	double altura, i, pesoIdeal ;
	i = 1;
	
	do {
		System.out.println("Digite seu sexo, F para feminino e M para Masculino");
		
		sexo = ler.next();
		
		System.out.println("Digite sua altura");
		
		altura = ler.nextDouble();
		
		if(sexo.equalsIgnoreCase ("M")) {
			System.out.println(pesoIdeal = 52 + (0.75 *(altura - 152.4)));
		}else if(sexo.equalsIgnoreCase ("F")) {
			System.out.println(pesoIdeal = 52 + (0.67 * (altura - 152.4)));
		}
		System.out.println("(Continuar) Escreva 1 para sim e 2 para não");
		
		i = ler.nextDouble();
		
	}while (i==1);
}
}
