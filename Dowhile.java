import java.util.Scanner;
class DoWhile{
	// This program shows the use of do-while loop.
	public static void main(String []args){
		Scanner kb=new Scanner(System.in);
		String choice;
		do{
			System.out.println("Enter the numbers");
			int a=kb.nextInt();
			int b=kb.nextInt();
			System.out.println("The sum is "+(a+b) );
			System.out.println("Do you want to continue? (yes/no)");
			choice=kb.next();
			//if you are using nextLine(); then you need to use it two times. 1st time it will take the enter from buffer and second will work
			
			}while(choice.equalsIgnoreCase("yes"));
	}
}