class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                s_max = max;
                max = arr[i];
            }
            else if(arr[i] > s_max && arr[i] != max){
                s_max = arr[i];
                
            }
            
        }
        if(s_max == Integer.MIN_VALUE){
            return -1;
        }
        else {
            return s_max;
        }
       
    }
}
