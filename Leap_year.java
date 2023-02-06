package Basic_program;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2003;
		
		if(year%100 ==0 && year%400 !=0)
			System.out.println("Not leap year");
		else if (year % 4 == 0)
			System.out.println("leap year");
		else
			System.out.println("Not leap year");
	}

}

