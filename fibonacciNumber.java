import java.util.Scanner;
public class fibonacciNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the max length for the series : ");
		int n = scan.nextInt();
		int num1=0, num2=1;
		System.out.println(num1+","+num2);
		for(int i=0;i<n;i++) {
			int tempNum=num1+num2;
			System.out.println(" "+tempNum);
			num1=num2;
			num2=tempNum;
				
			}
	}

}
