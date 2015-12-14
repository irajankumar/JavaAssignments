import java.util.Scanner;
class CMenu{
	//This program gives 4 choices in menu (to check prime, find factorial, sum of digits and quit) 
	public static void main(String []args)
	{
		int choice;
		do{
			System.out.println("Select an option\n1.Check Prime\n2.Find Factorial\n3.Find sum of digits\n4.Quit");
			Scanner kb=new Scanner(System.in);
			choice=kb.nextInt();
			switch (choice)
			{
				case 1:
				{
					System.out.println("Enter no:");
					int no=kb.nextInt();
					if(no>=2)
					{  int ctrl=0;
						run:
						for(int i=2;i<no;i++)
						{
							if(no%i==0)
							{
								ctrl++;
								break run;
							}
						}
						if(ctrl==0)
						{
							System.out.println("Prime");
						}else{
							System.out.println("Not prime");
						}
							
					}else{
						System.out.println("That no is lower than 2.");
					}
				}
				break;
				case 2:
				{
					System.out.println("Enter no:");
					int no=kb.nextInt();
					if(no>=1)
					{
						int factorial=1;
						for(int i=1;i<=no;i++)
						{
							factorial=factorial*i;
						}
					System.out.println("Factorial = "+factorial);	
					}else{
						System.out.println("That no is lower than 1.");
					}
				}
				break;
				case 3:
				{
					System.out.println("Enter no:");
					int no=kb.nextInt();
					int sum=0, ld;
					while(no>0)
					{
					    ld=(no%10);
						sum=sum+ld;
						no=no/10;
					}
				System.out.println("Sum of digits= "+sum);	
				}
				break;
				case 4:
				break;
				
				default:
				System.out.println("Wrong Input!");
				break;
			}
		}while(choice!=4);
	}
}