package q1;

public class Obstacle {
	public enum eLevel {Easy, Medium, Hard};
	
	private String name;
	private eLevel level;
	private int numOfCompetitors;
	private int numOfSucceedingCompetitors;
	
	public Obstacle(String name, eLevel level) {
		this.name = name;
		this.level = level;
		numOfCompetitors = 0;
		numOfSucceedingCompetitors = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public eLevel getLevel() {
		return level;
	}
	
	public void addCompetitor(boolean hasSucceed) {
		numOfCompetitors++;
		
		if (hasSucceed) {
			numOfSucceedingCompetitors++;
		}
	}
	
	public float successRate () {
		float sum=0;
		sum += numOfSucceedingCompetitors/numOfCompetitors;
		return sum;
	}

	@Override
	public String toString() {
		return name + "(" + level.name() + ") \t--> " + successRate() + "% success rate (" + numOfSucceedingCompetitors + "/" + numOfCompetitors + ")";
	}
}
