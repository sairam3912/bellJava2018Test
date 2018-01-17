import java.util.Scanner;
public class perfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ener the number to be checked: ");
		int n = scan.nextInt();
		int num=n,sum=0;
		for(int i=1;i<n;i++)
		{
			if((n%i)==0) {
				sum=sum+i;
			}
		}
		if(sum==num)
			System.out.println("The number is Perfect Number");
		else
			System.out.println("The number is not Perfect Number");

	}

}
