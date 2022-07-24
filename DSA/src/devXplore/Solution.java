package devXplore;

import java.util.*;
public class Solution {
	static Player findPlayerwithMinimumMatchesPlayed(Player[] obj) {
		int j=-0,min=obj[0].getMatchesPlayed();
		for(int i=1;i<obj.length;i++) {
			if(obj[i].getMatchesPlayed()<min) {
				min=obj[i].getMatchesPlayed();
				j=i;
			}
		}
		return obj[j];
		
	}
	static Player searchPlayerById(Player[] obj,int id) {
		int j=-1;
		for(int i=0;i<obj.length;i++) {
			if(obj[i].getId()==id) {
				j=i;
				break;
			}
		}
		if(j!=-1)
			return obj[j];
		else
			return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Player[] obj=new Player[size];
		for(int i=0;i<size;i++) {
			int id=sc.nextInt();
			int matchesPlayed=sc.nextInt();
			int totalRuns=sc.nextInt();
			
			sc.nextLine();
			
			String name=sc.nextLine();
			String team=sc.nextLine();
			obj[i]=new Player(id,matchesPlayed,totalRuns,name,team);
		}
		int id=sc.nextInt();

		Player minMatch=findPlayerwithMinimumMatchesPlayed(obj);
		System.out.println("id-"+minMatch.getId());
		System.out.println("matchesPlayed-"+minMatch.getMatchesPlayed());
		System.out.println("totalRuns-"+minMatch.getTotalRuns());
		System.out.println("name-"+minMatch.getName());
		System.out.println("team-"+minMatch.getTeams());
		
		Player playerId=searchPlayerById(obj,id);
		if(playerId!=null) {
			System.out.println("id-"+playerId.getId());
			System.out.println("matchesPlayed-"+playerId.getMatchesPlayed());
			System.out.println("totalRuns-"+playerId.getTotalRuns());
			System.out.println("name-"+playerId.getName());
			System.out.println("team-"+playerId.getTeams());
		}
		else
			System.out.println("No Player found with mentioned attribute.");
		sc.close();
}
}
class Player{
private int id;
private int matchesPlayed;
private int totalRuns;
private String name;
private String teams;
Player(int id,int matchesPlayed,int totalRuns,String name,String teams){
	this.id=id;
	this.matchesPlayed=matchesPlayed;
	this.totalRuns=totalRuns;
	this.name=name;
	this.teams=teams;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public int getMatchesPlayed() {
	return matchesPlayed;
}
public int getTotalRuns() {
	return totalRuns;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getTeams() {
	return teams;
}
}


