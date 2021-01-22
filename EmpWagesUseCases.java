public class EmpWagesUseCases
{
	public static void main (String args[])
	{
		//constants
		int IS_FULL_TIME = 1;

		//computation of employee attendance
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("employee is absent");
	}
}
