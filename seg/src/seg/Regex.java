package seg;

public class Regex {

	public static void main(String[] args) {
		String s= "sritam@gmail.com";
		String regex = "^[a-zA-z]{1,}+@[a-zA-Z]{1,}\\.[a-zA-Z]{2,}";
        if(s.matches(regex)) {
        	IO.println("valid");
        }
        else {
        	IO.println("invalid");
        }
	}

}
