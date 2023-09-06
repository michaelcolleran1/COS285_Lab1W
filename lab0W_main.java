
public class lab0W_main {

	public static void main(String[] args) {
		Fraction[] fractionArray = new Fraction[100];
		for(int i=0; i<fractionArray.length; i++)
		fractionArray[i] = new Fraction(i, i+1);
	}

}
