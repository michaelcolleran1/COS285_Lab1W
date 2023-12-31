/**
 * Fraction Class - class that generates object fraction from two ints.  Implements INumber inteface.
 * Uses methods to add, subtract, divide, and multiply fraction objects.
 * 
 * @author Max Rogers
 * @version 12 September 2023
 */

public class Fraction implements INumber{
	private int num;
	private int denom;
	
	
	public Fraction(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}
	
	/**
	 * Method used to add one fraction object to another
	 * @param input the Fraction to be added 
	 * @return added fractions
	 */
	public Object plus(Object input) {
		int commonDenom = this.getDenom()*((Fraction) input).getDenom();
		int firstFracNum = this.getNum()*((Fraction) input).getDenom();
		int secondFracNum = ((Fraction) input).getNum()*this.getDenom();
		return new Fraction(firstFracNum+secondFracNum, commonDenom);
	}
		
	/**
	 * Method used to subtract one fraction object from another
	 * @param input the Fraction to be subtracted 
	 * @return subtracted fractions
	 */
	public Object minus(Object input) {
		int commonDenom = this.getDenom()*((Fraction) input).getDenom();
		int firstFracNum = this.getNum()*((Fraction) input).getDenom();
		int secondFracNum = ((Fraction) input).getNum()*this.getDenom();
		return new Fraction(firstFracNum-secondFracNum, commonDenom);
	}

	
	/**
	 * Method used to divide one fraction object from another.  Uses the flipFraction method
	 * and the multiply method to cross multiply the fractions
	 * @param input the Fraction to be divided
	 * @return divided fraction
	 */
	@Override
	public Object divide(Object input) {
		Fraction firstFraction = new Fraction(this.getNum(), this.getDenom());
		Fraction recip = ((Fraction) input).flipFraction(input);
		return firstFraction.multiply(recip);
		
	}
	
	/**
	 * method to flip the numerator and denominator of a fraction to be used for cross multiplication
	 * @param input Fraction to be reversed
	 * @return reciprocal fraction
	 */
	public Fraction flipFraction(Object input) {
		int temp = ((Fraction) input).getDenom();
		((Fraction) input).setDenom(((Fraction) input).getNum());
		((Fraction) input).setNum(temp);
		return (Fraction) input;
	}
	
	/**
	 * method that multiplies fraction objects
	 * @param input Fraction to be multiplied to current fraction
	 * @return multiplied fraction
	 */
	@Override
	public Object multiply(Object input) {
		return new Fraction((((Fraction) input).getNum()*this.getNum()), 
				((Fraction) input).getDenom()*this.getDenom());
	}
	
	/**
	 * simple print method, prints the numerator and denominator of the current fraction object
	 */
	@Override
	public void print() {
		System.out.println(getNum()+" "+getDenom());		
	}
	
	
	//Standard Setters and Getters	
	public int getNum() {
		return num;
	}

	private void setNum(int num) {
		this.num = num;
	}

	public int getDenom() {
		return denom;
	}

	private void setDenom(int denom) {
		this.denom = denom;
	}
}	
