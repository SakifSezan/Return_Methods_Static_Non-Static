package firstpkg;

public class Second_Non_static_Return_Class {

	public static void main(String[] args) {
		Second_Non_static_Return_Class W = new Second_Non_static_Return_Class();
		W.S("Sakif", " Sezan");
	

	}
	public String S(String a, String b) {
		
		String c = a+b;
		System.out.println(c);
		return c;
		
	}
	

}
