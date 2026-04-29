package seg;

class Test {
    public static void main(String[] args) {

        String s = "abcbaababaaabcba";
        String sub = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                boolean flag = true;
                int left = i;
                int right = j;

                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        flag = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (flag==true && (j - i + 1) > sub.length()) {
                    sub = s.substring(i, j + 1); 
                }
            }
        }

        System.out.println(sub);
    }
}