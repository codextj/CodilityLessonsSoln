import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        if(A.length==1){
            if(A[0]!=1){return 1;}
            return 2;
        }
		
        Arrays.sort(A);
        int x =0; 
        while(x<A.length && A[x]<0)
        {   
             x++;
        }
        if(x==A.length){
            return 1; //as all the numbers must be <0 so next smallest positive num must be 1
        }
		
        boolean foundOne =false;
       
        for(int i=x;i<A.length-1; i++){
                
                if(!foundOne && A[i]==1)
                { foundOne =true;}
                
                if(A[i]==A[i+1])
                {
                    continue;  //can use while loop instead
                }
               
                else if(A[i]+1 < A[i+1])
                {   
                    
                    return foundOne ? A[i]+1 :1;             
                }
            }
             
        return  foundOne ? A[A.length-1]+1 :1;
    }
}

/*   
test cases                ans
[0]                        1
[-9,-8,-7]                 1
[9,8,10,99]                1
[1,2,5,6,7,9,10            3	
[1]                        2
[89]                       1
[1,2,3]                    4
[99,89,98]                 1
[89,90,91]                 1
*/
