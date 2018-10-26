
public class DiceArray 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int [] diceRolls = new int[13];
		
		
		for (int i = 2; i < diceRolls.length; i++)
			{
				diceRolls[dice1.roll() + dice2.roll()]++;
			}



	}

}
