package seg;

public class CheckValidBrackets {

	public static void main(String[] args) {
		String s = "([{}])";
        int top = -1;
        boolean flag = true;
        char arr[] = new char[s.length()];
        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(ch=='(' || ch=='{' || ch=='[') {
        		arr[++top]=ch;
        	}
        	else {
        		if(top==-1) {
        			flag = false;
        			break;
        		}
        	
        	
        	char last = arr[top--];
        	if((ch==')' && last!='(')||(ch=='}' && last!='{')||(ch==']' && last!='[') ) {
        		flag = false;
        		break;
        	}
        	}
        }
        	if(top!=-1) {
        		flag = false;
        	}
        
        IO.println(flag);
	}

}
