import java.util.Scanner;
class NPrimeNos
{ //This program take an integer as input and gives that amount of first prime numbers as output
	public static void main (String []args)
	{   int no=2, pcout=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number of first prime numbers you want to get:");
		
			int amt=kb.nextInt();
			
			System.out.println("The list of prime numbers is following:");
				outer:
				while(true)
				{ int ctrl=0;
					inner:
					for(int i=2;i<no; i++)
					{
						if((no%i)==0)
						{
							ctrl++;
							break inner;
						}	
					}
					if(ctrl==0)
					{
						System.out.println(no); 
						pcout++;
						if(pcout==amt)
						{
							break outer;
						}
					}
					no++;
					
				}
    }
}