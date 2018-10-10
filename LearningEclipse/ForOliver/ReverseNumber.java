import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long number, lastDigit, reverse = 0;

Scanner scan = new Scanner(System.in);

System.out.println("Enter a positive integer: ");

number = scan.nextLong();

do{
	lastDigit = number % 10;
	reverse = (reverse*10) + lastDigit;
	number = number / 10;
}

while (number>0);

System.out.println("That number reversed is " + reverse);
	}

}
