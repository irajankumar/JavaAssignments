import java.util.Scanner;
class Counter
{
	//WAP to create a class counter having method to count larger,smaller and equal number from an array
	static public int[] count(int []arr)
	{  
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int no=kb.nextInt();
		int []result=new int [3];
		for(int x:arr)
		{  
			if(no==x)
				result[0]++;
			else if(no>x)
				result[1]++;
			else
				result[2]++;
		}
		return result;
	}
}
class UseCounter
{   
	public static void main(String []args)
	{   Scanner kb=new Scanner(System.in);
		int []array=new int[10];
		int []result;
		System.out.println("Enter the elements in array:");
		for(int x=0;x<array.length;x++)
		{
			array[x]=kb.nextInt();
		}
			
		result=Counter.count(array);
			System.out.println("Total Numbers in array equal to given number are:"+result[0]);
			System.out.println("Total Numbers in array smaller than given number are:"+result[1]);
			System.out.println("Total Numbers in array bigger than given number are:"+result[2]);
	}
}