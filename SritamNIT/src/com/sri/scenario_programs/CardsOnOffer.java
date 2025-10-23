package com.sri.scenario_programs;

public class CardsOnOffer {

	public static CardType getOfferedCard(Customer obj) {
		int creditPoint=obj.getCreditPoints();
		if(creditPoint>=100 && creditPoint<=500) {
			return new CardType(obj, "silver");
		}
		else if(creditPoint>500 && creditPoint<=1000) {
			return new CardType(obj, "gold");
		}
		else if(creditPoint>1000) {
			return new CardType(obj, "platinum");
		}
		else {
			return new CardType(obj, "EMI");
		}
	}
}
