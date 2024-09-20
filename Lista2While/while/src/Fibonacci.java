import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int i,fibo,numb, rr;
		System.out.println("insira o enésimo termo");
	i = ler.nextInt();
	fibo = 0;
	numb = 1;
	rr = 1;
	while (i != 0) {
		System.out.println(rr);
		 fibo ++;
		 rr = fibo + numb;
		 numb += fibo;
		i--;
		
	}
}
}
