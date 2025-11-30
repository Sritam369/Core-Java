package com.sri.method_overriding;

class RBI{
	protected String ifscCode="RbiHyd0014";
	public String loan() {
		return "provide loan to customer.";
	}
}
class SBI extends RBI{
	protected String ifscCode="SbiHyd0014";
	public String loan() {
	
		return "provide loan to customer with 9.2% interest.";
	}
}

public class VariableHidingWhileUpcasting {

	public static void main(String[] args) {
		RBI r = new SBI();
		System.out.println(r.loan());
		System.out.println(((SBI)r).ifscCode);
		System.out.println(r.ifscCode);
		
		SBI s = new SBI();
		System.out.println(s.ifscCode);
		System.out.println(s.loan());
		
	}

}
