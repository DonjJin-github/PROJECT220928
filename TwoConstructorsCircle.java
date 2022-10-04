public class TwoConstructorsCircle {
	int radius;
	String name;
	
	
	public TwoConstructorsCircle() {		
		radius = 1;		
		name = "";
	}
	
	public TwoConstructorsCircle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {	
		return 3.14 * radius * radius;
	}
	
	
	public static void main(String[] args) {
		TwoConstructorsCircle pizza = new TwoConstructorsCircle(10, "자바피자");
	
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		TwoConstructorsCircle donut = new TwoConstructorsCircle();
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	
	}
}
