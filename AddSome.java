class AddSome{
	//This program takes some input with command Line Arguments and gives their sum as output
	public static void main(String []args)
	{
		if(args.length>=2)
		{   int sum=0;
			for(int i=0;i<args.length;i++)
			{
				sum=sum+Integer.parseInt(args[i]);
			}
			System.out.println("Sum= "+sum);
		}else{
			System.out.println("Please input at least 2 numbers");
		}
	}
}