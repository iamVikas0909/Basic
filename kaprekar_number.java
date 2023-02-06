package Basic_program;

public class kaprekar_number {

	public static void main(String[] args) 
	{

		int number =9;
		int num=number;
		
		int square=num*num;
		int cnt=0;
		while(num>0)
		{
			num=num/10;
			cnt++;	
		}
		int div = (int)Math.pow(10, cnt);
		int firstpart1 = square/div;
		int secoundpart = square%div;

		int sum = firstpart1 + secoundpart;
		if(sum==number)
		
		{
			System.out.println("kaprekar number");
		}
		else
		{
			System.out.println("not kaprekar number");
		}
		

	}

}
