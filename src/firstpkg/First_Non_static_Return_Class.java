package firstpkg;

public class First_Non_static_Return_Class {

	public static void main(String[] args) {
		First_Non_static_Return_Class T = new First_Non_static_Return_Class();
		T.S(100, 16);
		

	}
	public int S(int a, int b) {
		int c = a*b;
		System.out.println(c);
		return c;
	}

}
