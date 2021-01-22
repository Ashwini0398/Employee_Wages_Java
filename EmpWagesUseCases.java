public class EmpWagesUseCases
{
	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HR =20;


	public static void main (String args[])
	{
	
		//variable
		int empHrs=0;
		int empWage=0;

		//computation of employee attendance
		int empCheck =(int) Math.floor(Math.random() * 10) % 2;
		switch((empCheck))
		{
			case IS_PART_TIME:
				empHrs = 4;
				break;

			case IS_FULL_TIME:
				empHrs =  8;
				break;

			default:
				empHrs = 0;
		}

		empWage= empHrs * EMP_RATE_PER_HR;
		System.out.println("Employee Wages: "+empWage);

	}
}
