package Basic_program;

public class year_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=373;
		
		int year=num/365;
		System.out.println("year : "+year);
		int rem=num%365;
		int month= rem/30;
		System.out.println("month : "+month);
		int rem2=rem%30;
		int week = rem2/7;
		System.out.println("weeks : "+week);
		int days=rem2%7;
		System.out.println("days : "+days);
	}

}
