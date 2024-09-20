import java.util.Scanner;
public class Idade {
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		int nasc, atual, idade;
		System.out.println("Digite o ano que você nasceu");
		nasc=ler.nextInt();
		System.out.println("Digite o ano atual");
		atual=ler.nextInt();
		idade=(atual-nasc);
		System.out.println("a idade é"+idade);
		
		
		
	}
}
