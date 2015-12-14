class Singelton
{
	//This is a singelton class. I.e only one object of this class can be created.
	private static int counter=0;
	private Singelton()
	{
		counter++;
	}
	public static Singelton CreateSingelton()
	{ 
		//This kind of methods are called factory methods. Because, they are being used to generate objects of class.
		if(counter<1)
		{
			Singelton s=new Singelton();
			return s;
		}else
			return null;
	}
	public void show()
	{
		System.out.println("show function called...");
	}
}
class UseSingelton
{
	public static void main(String []args)
	{
		Singelton s=Singelton.CreateSingelton(); // First object is created
		s.show();
		Singelton s1=new Singelton(); // This will throw an error as constructor is private
		Singelton s2=Singelton.CreateSingelton(); // This will not created s2 will get a null value
		//s2.show(); //This will throw an error
	}
}