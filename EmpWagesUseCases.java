public class EmpWagesUseCases
{
	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
	
	private final String Company;
        private final int empRate;
	private final int numofdays;
	private final int maxHrs;

	public EmpWagesUseCases( String Company,int empRate,int numofdays ,int maxHrs )
	{
		this.Company = Company;   //instance variable
		this.empRate = empRate;
		this.numofdays = numofdays;
		this.maxHrs = maxHrs;
	}
	
	private int computeEmpWage( )
        {
	        //variables
                int empHrs = 0;
                int totalempHrs = 0;
                int totalworkingDays = 0;

                //computation  to get the total working days and total employee wage
                while ( totalempHrs <= maxHrs && totalworkingDays < numofdays )
                {
                        totalworkingDays++;

                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        switch(empCheck)
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
                
                return totalempHrs * empRate;
        }

        public static void main (String[] args)
        {
        	EmpWagesUseCases dmart = new EmpWagesUseCases("Dmart",20,2,10);
		EmpWagesUseCases Relience = new EmpWagesUseCases("Relience",10,2,20);
		System.out.println("total employee wage for a company" + dmart.Company + "is" + dmart.computeEmpWage());
		System.out.println("total employee wage for a company" + Relience.Company + "is" + Relience.computeEmpWage());
        }
}
