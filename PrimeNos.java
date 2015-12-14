import java.util.Scanner;
class PrimeNos{
	// This program takes a number as input and gives the list of prime numbers upto that number
	public static void main(String []args)
	{
		Scanner kb=new Scanner(System.in);
		int no,prime;
		System.out.println("Enter the number upto which you want to find prime numbers:")
		no=kb.nextInt();
		System.out.println("List of prime numbers is:")
		if(no>2){
		for(prime=2; prime<no; prime++){
			for(int c=2; c<prime; c++){
				if((prime%c)==0)
					break;
				else{
					System.out.println(prime);
				}
			}
		}
		
		}else{
			System.out.println("2");
		}
		
	}
}