class MyMath{
	public static void max(int a,int b)
	{
		if(a>b)
			System.out.println("Greater is "+a);
		else if(b>a)
			System.out.println("Greater is "+b);
		else
			System.out.println("Both are equal");
	}
}
class UseMyMath{
	public static void main(String []args)
	{
		MyMath.max(7,5);
	}
}