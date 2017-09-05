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
	else if(A[lastIndex] != A.length+1){
	  return A[lastIndex]+1;
	}
	
    for(i =0; i<lastIndex; i++){
        if(A[i] + 1 != A[i+1])
        {
          //missing number is A[i]+1
          break;
          
        }
    }
    return A[i]+1;
  }
}


/*

sort Array A
                                    [1,2,3,5]
                            index    0 1 2 3  4 
                                    [0,0,0,0, 0]
after finding missing number        [1,2,3,4, 5]
pattern at each index element present has value == index+1 
chk
empty
single
then if still we didnt find missing
loop over Array A if A[index]==index+1 
else break return index+1;
*/
--------trying to reduce usage of array.length by saving its value to variable, idk whether it has performance advantage or not---------
--------also instead of retrieving value of element from array we can simply generate it as element sequence follows pattern------------
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
