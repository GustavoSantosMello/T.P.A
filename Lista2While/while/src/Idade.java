import java.util.Scanner;
public class Idade {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int id, i, velho, novo;
	double porc1 =0, porc2 = 0, porc3 = 0, porc4 = 0, porc5 = 0, faixa1, faixa2, faixa3, faixa4, faixa5;
	velho = -10000;
	novo = 10000;
	i = 1;
	faixa1 = 0;
	faixa2 = 0;
	faixa3 = 0;
	faixa4 = 0;
	faixa5 = 0;
		while (i <= 15) {
				System.out.println("Digite a " + i + "� idade");	
				id = ler.nextInt();	
				i ++ ;
				if(id > velho) {
					velho = id;
				}
				if(id < novo) {
					novo = id;
				}
				System.out.println("==================================");
		if (id <= 15) {
			System.out.println( id   +   ":  1� Faixa Et�ria  ");
			faixa1 ++;
		} else if (id <= 30 ) {
			System.out.println( id  +  ": 2� Faixa Et�ria  ");
			faixa2 ++;
		} else if (id <= 45) {
			System.out.println( id +  ": 3� Faixa Et�ria");
			faixa3 ++;
		} else if (id <= 60) {
			System.out.println( id  +  ": 4� Faixa Et�ria");
			faixa4 ++;
		} else {
			System.out.println(id  +  ": 5� Faixa Et�ria");
			faixa5 ++;
		}
		System.out.println("==================================");
		
		porc1= faixa1/15*100;
		porc2= faixa2/15*100;
		porc3= faixa3/15*100;
		porc4= faixa4/15*100;
		porc5= faixa5/15*100;
		
		}
		
		System.out.println("==================================");
		System.out.println(faixa1  +  " Pessoas na primeira faixa");
		System.out.println(faixa2  +  " Pessoas na segunda faixa");
		System.out.println(faixa3  +  " Pessoas na terceira faixa");
		System.out.println(faixa4  +  " Pessoas na quarta faixa");
		System.out.println(faixa5  +  " Pessoas na quinta faixa");
		System.out.println("==================================");

		
		System.out.println(porc1  +  "% primeira faixa");
		System.out.println(porc2  +  "% segunda faixa");
		System.out.println(porc3  +  "% terceira faixa");
		System.out.println(porc4  +  "% quarta faixa");
		System.out.println(porc5  +  "% quinta faixa");
		System.out.println("==================================");
		
		
		System.out.println("O mais novo tem " + novo + " anos");
		System.out.println("O mais velho tem " + velho + " anos");
		
		
}

}