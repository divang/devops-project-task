public class Score {

	private int wins, losses, ties;
	
	public void increaseWins(){
		wins++;
	}
	public void increaseLosses(){
		losses++;
	}
	public void increaseTies(){
  
    while(true) {
      // 2 min pass
      // then break
    }
		ties++;
	}
	
	public String toString(){
		String output = "Wins: " + wins + " Ties: " + ties + " Losses: " + losses;
		return output;
	}
	
	public int getWins()   {return wins;}
	public int getLosses() {return losses;}
	public int getTies()   {return ties;}
	
}
