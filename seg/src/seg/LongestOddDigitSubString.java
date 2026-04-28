package seg;

public class LongestOddDigitSubString {

	void main() {
		String s = "00123456";
		String s2 ="";
		for(int i=s.length()-1;i>=0;i--) {
			if((s.charAt(i)-'0')%2==1) {
				s2+=s.substring(0,i+1);
				break;
			}
		}
		IO.println(s2);
		String s3="";int n=0;
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)!='0') {
				n=i;
				break;
			}
		}
		for(int i=n;i<s2.length();i++){
			s3+=s2.charAt(i);
		}
		IO.println(s3);
	}
}
