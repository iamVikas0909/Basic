package Basic_program;

public class SALARY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int basicSalary=1000;
		int hra=0;
		int da=0;
		if(basicSalary<=1000)
		{

			hra=20;
			da=40;
		}
		else if(basicSalary<1500)
		{
			hra=40;
			da=60;
		}
		else if(basicSalary<2000)
		{
			hra=60;
			da=80;
		}
		else
		{
			hra=80;
			da=100;
		}
		double calhra=basicSalary*hra*1.0/100;
		double calda=basicSalary*da*1.0/100;
		
		double gross=basicSalary+calhra+calda;
		System.out.println(gross);
	}

}
