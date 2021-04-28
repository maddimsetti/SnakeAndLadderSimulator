package snakeandladder;

public class SnakeAndLadderSimulator {

	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome the Player to Starts The Snake And Ladder Game at position 0");

		int POSITION1 = 0;
		int POSITION2 = 0;

		while ( POSITION1 < 100 && POSITION2 < 100 ) {
		int diceNumber1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
		int diceNumber2 = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("The Value Of Dice is " +diceNumber1);
		System.out.println("The Value of Dice2 is" +diceNumber2);

		int dieCheck = (int) Math.floor(Math.random() * 100) % 3;

		   switch (dieCheck) {
		      case IS_LADDER:
		           System.out.println("The player gets Ladder");
		           POSITION1 += diceNumber1;
		           break;
	              case IS_SNAKE:
			   System.out.println("the player gets Snake");
			   POSITION1 -= diceNumber1;
			    if (POSITION1 <= 0)
			       POSITION1 = 0;
		           break;
		      default:
			   System.out.println("The player gets No Play");
		           break;
		   }
		System.out.println("The Position of Player:" +POSITION1);
		    if (POSITION1 > 100) {
		        POSITION1 -= diceNumber1;
	                System.out.println("The Position of Player:" +POSITION1);
	            }
		    if (dieCheck == IS_LADDER) {
	            diceNumber1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
        	    System.out.println("The Value Of Dice2 is " +diceNumber1);
                    POSITION1 += diceNumber1;
	        }
	        if (POSITION1 > 100) {
		    POSITION1 -= diceNumber1;
		    System.out.println("The Position of Player:" +POSITION1);
	        }

	        int dieCheck2 = (int) Math.floor(Math.random() * 100) % 3;

                          switch (dieCheck2) {
	                      case IS_LADDER:
		                 System.out.println("The second player gets Ladder");
		                 POSITION2 += diceNumber2;
		                 break;
	                      case IS_SNAKE:
	                         System.out.println("the second player gets Snake");
	                         POSITION2 -= diceNumber2;
			            if (POSITION2 <= 0)
			               POSITION2 = 0;
		                 break;
	                      default:
	                         System.out.println("The second player gets No Play");
		                 break;
	                      }
                System.out.println("The Position of the Second Player:" +POSITION2);
	          if (POSITION2 > 100) {
                     POSITION2 -= diceNumber2;
		     System.out.println("The Position of Player:" +POSITION2);
	          }
	          if (dieCheck2 == IS_LADDER) {
		     diceNumber2 = (int) Math.floor(Math.random() * 10) % 6 + 1;
	             System.out.println("The Value Of Dice2 is " +diceNumber2);
                     POSITION2 += diceNumber2;
	          }
	          if (POSITION2 > 100) {
		     POSITION2 -= diceNumber2;
	             System.out.println("The Position of Player:" +POSITION2);
	          }
	        }
                System.out.println("The Final Position of the First Player:" +POSITION1);
                System.out.println("The Final Position of the Second Player:" +POSITION2);

                if (POSITION1 == 100)
          	   System.out.println("THE FIRST PLAYER WON THE GAME");
          	else
                   System.out.println("THE SECOND PLAYER WON THE GAME");
	}

}
