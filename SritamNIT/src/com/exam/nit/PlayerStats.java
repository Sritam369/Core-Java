package com.exam.nit;

public class PlayerStats {
private String playerName;
private int runs;
private double ballsFaced;
private int innings;
private int out;

public PlayerStats(String playerName, int runs, double ballsFaced, int innings, int out) {
	super();
	if(runs>=0 && runs<=10000 || ballsFaced>=0 && ballsFaced<=10000 || innings>=1 && innings<=500 || out>=0 && out<= innings) {
	this.playerName = playerName;
	this.runs = runs;
	this.ballsFaced = ballsFaced;
	this.innings = innings;
	this.out = out;
	}
	else {
		System.err.println("error");
	}
}

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public int getRuns() {
	return runs;
}

public void setRuns(int runs) {
	this.runs = runs;
}

public double getBallsFaced() {
	return ballsFaced;
}

public void setBallsFaced(int ballsFaced) {
	this.ballsFaced = ballsFaced;
}

public int getInnings() {
	return innings;
}

public void setInnings(int innings) {
	this.innings = innings;
}

public int getOut() {
	return out;
}

public void setOut(int out) {
	this.out = out;
}

public String average() {
   // return ballsFaced == 0 ? "Infinity" : String.format("%.2f", (double) runs / out);
    if(ballsFaced==0 && out==0 ) {
    	return "infinity";
    }
    else {
    	return String.format("%.2f", (double) runs / out);
    }
    
}


public double strikeRate() {
    return ballsFaced == 0 ? 0 : Double.parseDouble(String.format("%.2f", (runs / ballsFaced) * 100));
}

public String performance() {
	if(this.strikeRate()>=150) {
		return "explosive";
	}
	else if(this.strikeRate()>=100) {
		return "good";
	}
	else {
		return "needs improvement";
	}
}


@Override
public String toString() {
	return "PlayerStats [playerName=" + playerName + ", runs=" + runs + ", ballsFaced=" +(int) ballsFaced + ", innings="
			+ innings + ", out=" + out + ", average="+average()+", strikeRate="+strikeRate()+", performance="+performance()+"]";
}


}
