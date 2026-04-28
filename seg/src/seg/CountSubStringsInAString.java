package seg;

public class CountSubStringsInAString {

	public static void main(String[] args) {
		String s = "abc";
//		int n = s.length();
//		int total = n*(n+1)/2;
//		IO.println(total);
		
		// or
		
		int c = 0;
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				IO.println(s.substring(i, j+1));
				c++;
				
			}
		}
IO.println(c);
	}

}
