//For this game, Heads is 1, and if it's heads then result is true.
//Tails is 2, and if it's tails then result is false.
public class Game {

//	public static void main(String[] args) {
//		boolean guess = true;//Guessing heads
//		Toss game = new Toss(guess);
//		System.out.println(game.flip());
//	}
	private boolean guess;//This is going to be set from a button click, two buttons heads or tails
	
	private int totalGames = 0;
	private int wins = 0;
	private int winPercentage;
	
	private String guessName;
	private String result;
	private String wonOrLost;
	
	private Toss toss;
	
	public void makeGuess() {
		this.guess = true;//This will be changed, should be an input from the user.  Currently it is defaulting to guess heads each time.
		flipCoin();
	}
	
	public void flipCoin() {
		this.toss = new Toss(guess);
		makeStrings();
		if (toss.getResult() == true) {
			incrementWins();
		}
		incrementTotalGames();
		calculateWinPercentage();
	}
	
	public void makeStrings() {
		if(toss.getResult() == true) {
			this.result = "Heads";
		}
		else {
			this.result = "Tails";
		}
		
		if(guess == true) {
			this.guessName = "Heads";
		}
		else {
			this.guessName = "Tails";
		}
		
		if(toss.getWinOrLose() == true) {
			this.wonOrLost = "You guessed " + guessName + " and it was " + result + "!  You win!";
		}
		else {
			this.wonOrLost = "You guessed " + guessName + " and it was " + result + ".  You lose.";
		}
	}
	
	public void calculateWinPercentage() {
		winPercentage = 100 * (wins/totalGames);
	}
	
	public void incrementTotalGames() {
		totalGames++;
	}
	
	public void incrementWins() {
		wins++;
	}
	
	public String didYouWin() {
		return wonOrLost;
	}
	
	public int getWinPercentage() {
		return winPercentage;
	}
}
