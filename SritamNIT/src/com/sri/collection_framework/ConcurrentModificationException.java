package com.sri.collection_framework;

import java.util.Iterator;
import java.util.Vector;

record player(Integer id,String name,Double basePrice) {
	
}
class IPLAuction{
	private String iplTeam;
	private Vector<player>listOfPlayers;
	
	public IPLAuction(String iplTeam) {
		this.iplTeam=iplTeam;
		listOfPlayers=new Vector<>(15);
	}
	public void add(player players) {
		listOfPlayers.add(players);
	}
	public void retainOrRelease() {
		for(player list:listOfPlayers) {
			if(list.basePrice()==5000) {
				listOfPlayers.remove(list);
				break;
			}
		}// will only remove one object.Without break it'll give concurrentmodificationexception.
		
		Iterator<player>itr=listOfPlayers.iterator();
		while(itr.hasNext()) {
			player player=itr.next();
			if(player.basePrice()>5000) {
				itr.remove();
			}
		}
	}
	public void display() {
		listOfPlayers.forEach(IO::println);
	}
	
}
public class ConcurrentModificationException {
  void main() {
	  IPLAuction ipl = new IPLAuction("rcb");
	  ipl.add(new player(111,"virat",6000d));
	  ipl.add(new player(222,"bhuvi",5000d));
	  ipl.add(new player(333,"abd",5000d));
	  ipl.retainOrRelease();
	  ipl.display();
  }
}
