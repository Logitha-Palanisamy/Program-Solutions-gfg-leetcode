class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int larg=-1;
        int seclarg=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                seclarg=larg;
                larg=arr[i];
            }
            else if(arr[i]<larg&& arr[i]>seclarg){
               seclarg=arr[i];
            }
            
        }
        return seclarg;
       
    }
}