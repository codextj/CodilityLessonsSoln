class Solution {
   
       public int[] solution(int[] A, int K)
    {
        
        int size = A.length;
        if(size == 0 || K % size ==0){
        return A; //rotatedArray will be same as orignal
        }
        int[] rotatedArray = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            rotatedArray[(i + K) % A.length] = A[i];
        }
        return rotatedArray;
   }  
    
}
