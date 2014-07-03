//For this game, Heads is 1, and if it's heads then result is true.
//Tails is 2, and if it's tails then result is false.
public class Game {

	public static void main(String[] args) {
		boolean guess = true;//Guessing heads
		Toss game = new Toss(guess);
		System.out.println(game.flip());
	}
}
