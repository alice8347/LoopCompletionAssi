import java.util.Scanner;

public class GetIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int num, total = 0, i = 0;

		while (i < 10) {// Loop should start here
			num = keyboard.nextInt();
			total += num;
			i++;
		}//Loop should end here

		System.out.println("The total of all 10 numbers is " + total);

	}

}
