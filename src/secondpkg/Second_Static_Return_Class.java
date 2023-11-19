package secondpkg;

public class Second_Static_Return_Class {

	public static void main(String[] args) {
		Second_Static_Return_Class.C("Rasif", " Sayan");	

	}
	public static String C(String a, String b) {
		
		String c = a+b;
		System.out.println(c);
		return c;
	}

}
