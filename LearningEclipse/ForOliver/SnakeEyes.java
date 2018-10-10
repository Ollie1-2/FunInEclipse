
public class SnakeEyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ROLLS = 500;
		int num1, num2, count = 0;
		Die die1 = new Die();
		Die die2 = new Die();
		PairOfDice pair = new PairOfDice(die1, die2);
		
		for(int roll=1; roll<= ROLLS; roll++){
			pair.rollio();
			if(pair.sum()==2){
				count++;
			}
			System.out.println("Number of rolls: "+ ROLLS);
			System.out.println("Number of snake eyes " + count);
			System.out.println("Ratio: " + (float) count/ROLLS);
		}
	}

}
