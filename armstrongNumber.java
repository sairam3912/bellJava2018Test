import java.util.Scanner;

public class armstrongNumber {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to be checked: ");
		int n =scan.nextInt();
		int sum=0,arm;
		arm=n;
		while(n!=0){
			int temp= n%10;
			sum=sum+(temp*temp*temp);
			n=n/10;
			}
		System.out.println(sum);
        if(arm==sum) 
			System.out.println("Number is  Armstrong" );
		
		else 
			System.out.println("Number is not Armstrong" );
			
	
	}

}
