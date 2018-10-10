import java.util.Random;
import java.util.Scanner;
public class PP31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String a = "First Name:";
		String b = "Last Name:";
		String x;
		String y;
		String xx;
		String yy;
		System.out.println(a);
		x = scan.nextLine();
		System.out.println(b);
		y = scan.nextLine();
		
		x=x.toLowerCase ();
		y=y.toLowerCase ();
		xx=x.substring(0,1);
		yy=y.substring(0,5);
		
		
		Random rand = new Random();
				System.out.println(xx + yy + (rand.nextInt(90)+10));
		
	}

}
