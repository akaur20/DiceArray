
public class DiceArray 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int [] diceRolls = new int[13];
		int numRolls = 0;
		
		
		for (int i = 2; i < diceRolls.length; i++)
			{	
				while (numRolls < 1000)
				{
					diceRolls[dice1.roll() + dice2.roll()]++;
					numRolls ++;
				}
				System.out.println("Number of times you rolled " + i + ": " + diceRolls[i]);
			}
		
		System.out.println("Total number of rolls: " + numRolls);


	}

}
