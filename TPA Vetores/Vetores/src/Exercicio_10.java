import java.util.Scanner;
public class Exercicio_10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], c[], i, d=0;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " + (i+1) + " valor do vetor A");
				a[i] = ler.nextInt();
		}
		System.out.println("---------------------------------------");
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " + (i+1) + " valor do vetor B");
				b[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++){
            if(a[i]!=b[0] && a[i]!=b[1] && a[i]!=b[2] && a[i]!=b[3] && a[i]!=b[4] && a[i]!=b[5] && a[i]!=b[6] && a[i]!=b[7] && a[i]!=b[8] && a[i]!=b[9]){
                c[d]=a[i];
                	d++;
            }
        }
        System.out.print("A=[");
        
        for(i=0;i<TAM;i++){
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
        
        System.out.print("\nB = ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] +", ");
		}
		System.out.print("]");
        
        System.out.print("\nC = ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i] +", ");
		}
		System.out.print("]");
        
    }
}
