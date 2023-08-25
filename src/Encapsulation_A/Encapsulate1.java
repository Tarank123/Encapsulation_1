package Encapsulation_A;

public class Encapsulate1 //java class which is fully encapsulated
                                                   
{
	private int emp_id;//it has private data members 
	private int emp_account;
	public void  setemp_id(int a)//it has public setter method for set emp_id
	{
		emp_id=a;
	
	}
	public int getemp_id()//it has public getter method for get emp_id
	{
	 return ++emp_id;
		
	}
}
	


