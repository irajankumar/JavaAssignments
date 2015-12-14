class AnotherSingelton
{
	//This is a Singelton class. I.e only one object of this class can be created.
	private static int counter=0;
	public AnotherSingelton()
	{
		if(counter>0) return null; // Error. We cannot return any value from constructor
		counter++;
	}
	public void show()
	{
		System.out.println("show function called...");
	}
}
class UseAnotherSingelton
{
	public static void main(String []args)
	{
		AnotherSingelton s=new AnotherSingelton(); // First object is created
		s.show();
		AnotherSingelton s2= new AnotherSingelton(); // This will not create. s2 will get a null value
		//s2.show(); //This will throw an error
	}
}