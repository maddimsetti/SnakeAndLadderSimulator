package snakeandladder;

public class SnakeAndLadderSimulator {

	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome the Player to Starts The Snake And Ladder Game at position 0");

		int POSITION = 0;
		int dieRole = 0;

		while ( POSITION < 100 ) {
		int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("The Value Of Dice is " +diceNumber);
                dieRole++;

		int dieCheck = (int) Math.floor(Math.random() * 100) % 3;

		   switch (dieCheck) {
		      case IS_LADDER:
		           System.out.println("The player gets Ladder");
		           POSITION += diceNumber;
		           break;
	              case IS_SNAKE:
			   System.out.println("the player gets Snake");
			   POSITION -= diceNumber;
			    if (POSITION <= 0)
			       POSITION = 0;
		           break;
		      default:
			   System.out.println("The player gets No Play");
		           break;
		   }
		System.out.println("The Position of Player:" +POSITION);
		System.out.println("The Count of Die Role :" +dieRole);
		    if (POSITION > 100) {
		        POSITION -= diceNumber;
	                System.out.println("The Position of Player:" +POSITION);
	            }
	        }
                System.out.println("The Final Position of Player:" +POSITION);
                System.out.println("The Total number of Times Die Role :" +dieRole);
	}

}
