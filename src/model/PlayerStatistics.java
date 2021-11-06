package model;

public class PlayerStatistics {

	Integer goals = 0;
	
	public Integer getStatistics(){
		return goals;
	}
	
	public void setStatistics(Integer n){
		goals = n;
	}
	
	@Override
	public String toString() {
		return Integer.toString(goals);
	}
}
