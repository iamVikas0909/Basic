package Basic_program;

public class pelseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ft=0;
		int st=1;
		int nt=0;
		System.out.print(ft+" "+st);
		for(int i=1; i<15;i++)
		{
			
			nt=ft+(st*2);
			System.out.print(" "+nt);
			ft=st;
			st=nt;
		}
	}

}
