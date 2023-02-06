package Basic_program;

public class Count_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=165423456;
		int count=0;

		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
