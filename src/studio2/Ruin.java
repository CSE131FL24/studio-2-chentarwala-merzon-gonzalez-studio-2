package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Amount = 10; 
		double winChance = 0.9;
		double winlimit = 20;
		int days = 10;
		int winDays = 0;
		int lossDays = 0;
		double a = (1-winChance)/winChance;
		double expectedRuin = 0.0;
		if (winChance == 0.5) {
			 expectedRuin = 1 - (Amount)/(winlimit); 
		}
		else {
			expectedRuin = (Math.pow(a, Amount) - Math.pow(a, winlimit))/(1-Math.pow(a, winlimit));
		}
		 
		System.out.println(expectedRuin);
		for (int TotalSimulations = 1; TotalSimulations <= days; TotalSimulations++) {
			int plays = 0;
			Amount = 10;
			while ((Amount < winlimit) && (Amount >= 0)) {
				boolean win = false;
				double chance = Math.random();
				if (chance < winChance ){
					win = true;
					Amount += 1;
					plays = plays + 1; 
				}
				else {
					win = false;
					Amount -= 1;
					plays = plays + 1;
				}
			}
			System.out.println(TotalSimulations);
			System.out.println(plays);
			if (Amount <= 0) {
				lossDays = lossDays + 1;
				System.out.println("Ruin");
			}
			else {
				winDays = winDays + 1;
				System.out.println("Success");
			}
		}
	}

}
