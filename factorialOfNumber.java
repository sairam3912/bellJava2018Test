import java.util.Scanner;
public class factorialOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();int fact=1;
		if(n<0)
		{
			System.out.println("Invalid number");
		} 
		else
		{
		    for(int i=1;i<=n;i++)
		    {
			fact=fact*i;	
		}
		    System.out.println("The factorial of " + n + " is : " +fact);
		}
		
	}

}
