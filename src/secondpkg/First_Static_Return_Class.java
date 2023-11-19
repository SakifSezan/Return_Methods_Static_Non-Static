package secondpkg;

public class First_Static_Return_Class {

	public static void main(String[] args) {
		First_Static_Return_Class.S(100, 4250, 10);

	}
	public static int S(int w, int e, int r) {
		
		int t = w+e*r;
		System.out.println(t);
		return t;
	}

}
