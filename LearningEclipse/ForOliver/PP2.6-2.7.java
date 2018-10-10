
public class PP2627 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.6
		int A=3;
		int B=4;
		int C=2;
		System.out.println(A + " hours " + B + " minutes and " + C + " seconds is");
		System.out.println(60*60*A + 60*B + C + " seconds");
		// 2.7
		int D=11000;
		
		int F=D/3600;
		int Z=F*3600;
		int E=D/60-Z/60;
		int G= D-F*60*60-E*60;
		System.out.println();
		System.out.println(D + " seconds is");
		System.out.println(F + " hours " + E + " minutes " + G + " seconds");
		
	}

}
