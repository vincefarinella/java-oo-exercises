package ClassDesign;

public class Fraction {

	private Integer numerator;
	private Integer denominator;
	
	public Fraction (Integer numerator, Integer denominator) {
		this.numerator = numerator;
		this.denominator = denominator;				
	}
	
	public double getAdd() {
		if (this.denominator == f2.denominator) {
			return this.numerator + f2.numerator this.denominator;
		}
		else {
			return "cant";
		}
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,4);
		System.out.println(f1.getAdd(f2));
	}

}
