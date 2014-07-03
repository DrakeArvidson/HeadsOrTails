import java.util.Random;

//For this game, Heads is 1, and if it's heads then result is true.
//Tails is 2, and if it's tails then result is false.
public class Toss {

	private boolean guess;
	private boolean result;
	private boolean winOrLose;
	
	public Toss(boolean guess) {
		this.guess = guess;
	}
	
	public boolean getResult() {
		return result;
	}
	
	public boolean getWinOrLose() {
		return winOrLose;
	}
	
	public boolean flip() {
		Random rand = new Random();
		int randomNum = rand.nextInt((2 - 1) + 1) + 1;
		if (randomNum == 1) {
			result = true;
			System.out.println("result is heads");
		}
		else if (randomNum == 2) {
			result = false;
			System.out.println("result is tails");
		}
		else {
			System.out.println("randomNum was something other than 1 or 2, this case should never happen");
			result = false;
		}
		return guess == result;
	}
}
