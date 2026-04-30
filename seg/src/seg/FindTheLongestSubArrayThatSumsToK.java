package seg;

public class FindTheLongestSubArrayThatSumsToK {

	void main() {
		int arr[] = {1,0,0,1,1,1};
		int k=2;
		int maxLen=0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==k) {
					int len = j-i+1;
					if(len>maxLen) {
						maxLen=len;
					}
				}
			}
		}
		System.out.println(maxLen);
	}
}
