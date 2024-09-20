import java.util.Scanner;
public class Salario {
	public static void main(String args[])	{
	Scanner ler=new Scanner(System.in);
	double s1, aumento, s2;
	System.out.println("digite seu salario: ");
	s1=ler.nextDouble();
	System.out.println("digite seu aumento em porcentagem: ");
	aumento=ler.nextDouble();	
	s1=(s1/100)*aumento;
	s2=s1+aumento;
	System.out.println("aqui está seu salario "+s2);

	}
	
}