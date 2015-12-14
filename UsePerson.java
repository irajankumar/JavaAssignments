class Person
{
	// A class whose object cannot be created if the age is below 18
	private int age;
	private String name;
	private Person(int a, String b)
	{
		//Constructor has been made private to restrict the access of this and get control over how object will be created.
		age=a;
		name=b;
	}
	public void show()
	{
		System.out.println("Age: "+age+" "+"Name: "+name);
	}
	public static Person CreatePerson(int x, String y)
	{
		//This is a factory method. This is being used to create objects.
		if(x>=18)
		{
			Person p=new Person(x,y);
			return p;
		} 
		else return null;
	}
}
class UsePerson
{
	// This is driver class of person class.
	public static void main(String []args)
	{
		Person s=Person.CreatePerson(21,"Anu");
		s.show();
		Person s2=Person.CreatePerson(17,"Amit"); //This will not create. s2 will get null.
		s2.show(); //This will throw an error during run time
	}
}