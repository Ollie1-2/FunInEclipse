
public class PairOfDice {
 private Die die1 = new Die();
 private Die die2 = new Die();
 
public Die getDie1() {
	return die1;
}
public void setDie1(int z) {
	die1.setFaceValue(z);
}
public Die getDie2() {
	return die2;
}
public void setDie2(int z){
	die2.setFaceValue(z);
}
public void rollio(){
die1.roll();
die2.roll();
}

public PairOfDice(Die die1,Die die2){
	this.die1=die1;
	this.die2=die2;
}
public int sum(){
	return die1.getFaceValue()+die2.getFaceValue();
}

}
