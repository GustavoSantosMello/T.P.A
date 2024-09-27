
public class altura {
	public static void main(String[] args) {
		double alturaJ, alturaP, cresJ, cresP;
		int i;
		i = 0;
		alturaJ = 1.34;
		alturaP = 1.45;
		cresJ = 0.025;
		cresP = 0.020;
		while (alturaJ < alturaP) {
			alturaJ = alturaJ + cresJ;
			alturaP = alturaP + cresP;
			i++;
		}
		System.out.println("joão ira ficar mais alto que pedro em " + i + " anos");
	}
}
