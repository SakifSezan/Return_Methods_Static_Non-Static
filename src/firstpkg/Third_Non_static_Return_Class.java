package firstpkg;

public class Third_Non_static_Return_Class {

	public static void main(String[] args) {
		Third_Non_static_Return_Class D = new Third_Non_static_Return_Class();
		D.A(1.00, 3.16);
		

	}
	public double A(double x, double y) {
		
		double z = x+y;
		System.out.println(z);
		return z;
	}

}
