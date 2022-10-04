
class CircleRadius{
	int radius;
	public CircleRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}


public class CircleArray {
	public static void main(String[] args) {
		CircleRadius[] c;
		c = new CircleRadius[5];
		
		for(int i=0; i<c.length;i++)
			c[i] = new CircleRadius(i);
		
		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea())+ " ");
		
	}
}
