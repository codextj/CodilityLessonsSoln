//code in Version 1 PermMissingNumV1.java is more readable

/*algorithm is same as previous version V1 only some minor changes mentioned below to try to increase performance but I think perfromance 
benefits are almost negligiable AS BOTH THE VERSION SCORED 100% in performance*/

/*--------trying to reduce usage of array.length by saving its value to variable, idk whether it has performance advantage or not---------
--------also instead of retrieving value of element from array we can simply generate it as element sequence follows pattern------------*/
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
    Arrays.sort(A);
    int i;
    int lastIndex = A.length-1;
    if(lastIndex == -1){
        //ie array is empty 
        return 1;
        }
	if(A[0] != 1){
	  return 1;
	}
	else if(A[lastIndex] != lastIndex+2){
	  return lastIndex+2;
	}
	
    for(i =0; i<=lastIndex; i++){
        if(A[i] != i+1)
        {
          //missing number is A[i]+1
          break;
          
        }
    }
    return i+1;
  }
}
