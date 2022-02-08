package Bridge_Labz;

public class Ladder_UC7 {
	public static final int Ladder = 1;
    public static final int Snake =2;
    public static final int Max = 6, Min = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diceRolled1 = 0, diceRolled2 = 0;
	    int randNum = 0;
	    System.out.println("welcome player1 and player2");
	    diceRolled1 = game(diceRolled1 , randNum);
	    diceRolled2 = game(diceRolled2 , randNum);
	    int diff = diceRolled1 - diceRolled2;
	    if(diff <= 0)
	        System.out.println("player1 is the winner");
	    else
	        System.out.println("player2 is the winner");
	}

	public static int game(int diceRolled, int randNum) {
	    diceRolled = 0;
	    int position = 0;
	    while (position < 100) {
	        randNum = (int) Math.floor(Math.random() * (Max - Min + 1) + Min);
	        diceRolled += 1;
	        int option = (int) Math.floor(Math.random() * 10) % 3;
	        if(option == 1)
	            diceRolled -=1;
	        switch (option) {
	            case Ladder:
	                        position += randNum;
	                        if (position > 100)
	                        position -= randNum;
	                        break;
	            case Snake:
	                        position -= randNum;
	                        if (position < 0)
	                        position = 0;
	                        break;
	               default:
	                       
	        }
	    }
	     return diceRolled;

	}


	}


