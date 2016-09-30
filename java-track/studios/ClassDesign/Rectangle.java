package ClassDesign;

public class Rectangle {
	
	private Integer length;
	private Integer width;
	
	public Rectangle(Integer length, Integer width) {
		this.length = length;
		this.width = width;	
	}
	
	public Integer getPerimeter() {
		return (this.length * 2) + (this.width *2);
	}
	
	public Integer getArea() {
		return this.length * this.width;
	}
	
	public Boolean getCompare(Rectangle deminsions2) {
		return this.getArea() < deminsions2.getArea();
	}
	
	public String getCheckSquare() {
		if (this.length == this.width){
		return "you have a square";
		}
		else {
			return "not a square";
		}
	}

	public static void main(String[] args) {
		Rectangle deminsions1 = new Rectangle(5,5);
		Rectangle deminsions2 = new Rectangle(8,4);
		System.out.println(deminsions1.getPerimeter());
		System.out.println(deminsions1.getArea());
		System.out.println(deminsions1.getCompare(deminsions2));
		System.out.println(deminsions1.getCheckSquare());
		System.out.println(deminsions2.getCheckSquare());
	}

}
