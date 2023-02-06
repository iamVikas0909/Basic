package Basic_program;

public class MyClass12 {

	public static void main(String[] args) 
	{
		//basic120
		 float A = 4.23F;
	    float B = 3.23F;
	    float Z = 2;

		myCode(A,B,Z);
	}

	private static void myCode(double A, float B, float Z)
	{
	

	    Z *= ++B + A % B;

	    System.out.println(Z);
	  }
}

