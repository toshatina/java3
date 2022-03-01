package vitalich.newpackage;
import static java.lang.Math.sqrt;
public class myfirstprogram {
	public static void main(String[] args) {


		point p1 = new point();
		point p2 = new point();
		p1.x = 0;
		p1.y = 0;
		p2.x = 3;
		p2.y = 4;
		System.out.println(Distance(p1,p2));
	}
		public static double Distance (point p1, point p2)
		{
			return sqrt((((p1.x) - (p2.x)) * ((p1.x) - (p2.x))) + (((p1.y) - (p2.y)) * ((p1.y) - (p2.y))));

		}

}