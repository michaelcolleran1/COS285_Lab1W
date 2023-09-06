
public class task1 {
	
	/** A method that compares the input fraction to those in the array and looks for duplicates.
	 * If there is a duplicate the boolean returns true.
	 * 
	 * Michael Colleran
	 * 
	 * @param F
	 * @return true/false
	 */
	
	public boolean hasSameValue(FRACTION_HERE F) {
		for(int i = 0; i < ARRAY_HERE.length; i++) {
			if(F[i] == F[(i + 1)] ) {
				return true;
			}
			
		}
			return false;	
	}

