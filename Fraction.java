
public class Fraction implements INumber{
	private int num;
	private int denom;
	
	
	public Fraction(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}


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

	public Object plus(Object input) {
		return null;		
	}

	public Object minus(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object divide(Object input) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object multiply(Object input) {
		return new Fraction((((Fraction) input).getNum()*this.getNum()), 
				((Fraction) input).getDenom()*this.getDenom());
	}


	@Override
	public void print() {
		System.out.println(getNum()+" "+getDenom());		
	}
}

	
