final class demo
{
	public void show()
	{
		System.out.println("This is show method of Super class");
	}
}

class demo2 extends demo
{ 
	//This will throw an error as it cannot inherit demo 
	
	public void display()
	{
		System.out.println("This is display of demo2");
	}
	
	public static void main(String []args)
	{
		display(); //This will work as it is method of demo2
		super.show(); //This will not work as it is method of demo
	}
}