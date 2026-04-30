package seg;

class NthLargestNum {
 public static void main(String[] args) {
    int arr[] = {7,2,9,4,5};
    int val = 3;
    int result = Integer.MIN_VALUE;
    for(int i=0;i<val;i++){
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
                index = j;
            }
        }
        result = max;
        arr[index] = Integer.MIN_VALUE;
        
    }
    System.out.println(result);
 }
}
