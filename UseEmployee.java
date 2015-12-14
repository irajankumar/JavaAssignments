class Employee
{
	// Wap to create employee class add method to generate automatic id and other (11/09/2015)
	
	private int age;
	private String name;
	private int id;
	public static int ctl=0;
	public Employee(int a, String b)
	{  ctl=ctl+1; 
		id=ctl;
		age=a;
		name=b;
	}
	public void show()
	{
		System.out.println("ID No:"+id+"\n"+"Name:"+name+"\n"+"Age:"+age+"\n");
		
	}
	public void ShowNextId()
	{
		System.out.println("Next id to be alloted is:"+(id+1));
	}
	
}
class UseEmployee
{
	public static void main(String []args)
	{
		Employee emp=new Employee(20, "Jaale Wale");
		Employee emp2=new Employee(19,"Shushmita Pathak");
		emp.show();
		emp2.show();
		emp.ShowNextId();
		emp2.ShowNextId();
	}
}