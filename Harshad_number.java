package Basic_program;

public class Harshad_number {

	public static void main(String[] args) {
		int num = 21 ;
		int temp  =num;
		int rem = 0;
		int sum=0;
		
		
		while(num>0)
		{
			rem =num%10;
			//System.out.println(rem);
			sum =sum+rem;
			num =num/10;
			//System.out.println(num);
		}
		//  System.out.println(num);
		if(temp % sum ==0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("Not an Harshad number");
		}

	}

}
