package Basic_program;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year =2004;
		
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("leap");
			}
			else
			{
				System.out.println("not leap ");
			}
		}
		else
		{
			if(year%4==0)
			{
				System.out.println("leap");
			}
			else
			{
				System.out.println("NOT LEAP");
			}
			
		}
		
	}

}
