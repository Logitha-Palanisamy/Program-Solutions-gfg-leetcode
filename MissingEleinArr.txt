class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long sum=(long)n*(n+1)/2;
        long pos=0;
        for(int i=0;i<arr.length;i++){
           pos=pos+arr[i];
           
        }
        return (int)(sum-pos);
     
    }
}