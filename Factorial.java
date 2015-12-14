import java.util.Scanner;
class Factorial {
	// This program calculates the factorial of a number using for loop
	public static void main(String []args){
		System.out.println("Enter the number for which you want to find out factorial:");
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int factorial;
		for(factorial=1;n>1;n--){
			factorial=factorial*n;
		}
		
		System.out.println("The factorial of number is "+ factorial);
	}
}