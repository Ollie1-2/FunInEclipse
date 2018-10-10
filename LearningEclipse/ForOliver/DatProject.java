
import java.util.Arrays;
import java.util.Scanner;

public class DatProject {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		String a = "How many numbers?";
		int N;
		System.out.println(a);
		N = scan.nextInt();
		
		float[] f = new float[N];
		int z = N;
		float k=0;
		float StandDev = 0;
		
		while (N>0){
			System.out.println("Enter a Numba:");
			float x =scan.nextFloat();
			f[N-1]=x;
			k += x;
			
					N--;
		} float mean = k/z;

		
		for (int n=0; n<f.length; n++){
			StandDev += (f[n]-mean)*(f[n]-mean)/(z);
		}
		
		
		System.out.println("The mean of your numbers is: " + mean);
		  System.out.printf("The Standard deviation is: %.6f \n" , Math.sqrt(StandDev));
	
		
		  
		  System.out.println("Your original sequence of numbers was: "+ Arrays.toString(f));
		
		  float h=f[z-1];
		float e=f[N];
		f[z-1]=e;
		f[N]=h;
		
	
		  System.out.println("The sequence with the first and last input swapped is "+ Arrays.toString(f));
		

	
	}

}
