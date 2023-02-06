package Basic_program;

public class fabonic_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ft =0;
		int st=1;
		int nt=0;
		System.out.println(ft +"\n"+st);
		for (int i =1; i<15; i++)
		{
			nt= st+ft;
			System.out.println(nt+" ");
			ft=st;
			st=nt;
		}
	}
 

}