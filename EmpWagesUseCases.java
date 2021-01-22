public class EmpWagesUseCases
{
	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HR =20;
	public static final int NUMBER_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;



	public static void main (String args[])
	{
	
		//variable
		int empHrs=0;
		int totalempHrs = 0;
		int totalworkingDays = 0;

		//computation for getting total working days of an employee
		while ( totalempHrs <= MAX_HRS_IN_MONTH && totalworkingDays < NUMBER_OF_WORKING_DAYS )
		{
			totalworkingDays++;

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

			totalworkingDays += empHrs;
	
				System.out.println( " Days: " + totalworkingDays + "emp Hrs" + empHrs );

		}

	int totalEmpWage = totalempHrs *  EMP_RATE_PER_HR;

	System.out.println("Total employee wage : " + totalEmpWage);

	}
}
