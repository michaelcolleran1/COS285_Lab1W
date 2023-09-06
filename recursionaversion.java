import java.lang.reflect.Array;

public class recursionaversion {
	
	/**
	 * Takes an array as input and utilizes recursion to print the array.
	 * (array should be previously sorted by another method)
	 * @param F
	 */

	
	public void printReverse(array F[]) {
	for(int i = 0; i < F.length;) {
		System.out.print(F[i] + ", ");
		i++;
		printReverse(F[i]);
		
		}
	
	}
}
