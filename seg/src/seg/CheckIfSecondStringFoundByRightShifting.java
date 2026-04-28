package seg;

public class CheckIfSecondStringFoundByRightShifting {

	public static void main(String[] args) {
		String s1 = "amazon";
		String s2 = "onamaz";
		boolean flag = false;
		String s3 = s1+s1;
		for(int i=0;i<s3.length()-s2.length();i++) {
			int j;
			for(j=0;j<s2.length();j++) {
				if(s3.charAt(i+j)!=s2.charAt(j)) {
					break;
				}
			}
			if(j==s2.length()) {
				flag = true;
				break;
			}
		}
		IO.println(flag);

	}

}
