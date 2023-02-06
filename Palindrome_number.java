package Basic_program;

public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int temp=num;
		int sum=0;
		int rem=0;

		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			//System.out.println(sum);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");	
		}
		else
		{
			System.out.println("Not palindrome");	
		}
	}

}
