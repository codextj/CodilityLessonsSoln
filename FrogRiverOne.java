
import java.util.HashSet;
class Solution {
   public int solution(int X, int[] A)
  {
      int size = A.length;   
      if(size == 1){
          if(A[0]==1 && X==1){
              return 0;
          }
          return -1;
        }
        int lastIndex = size-1;
        int time = -1;
        HashSet<Integer> leafs = new HashSet<>();
        for(int i =0; i<=lastIndex; i++){
            leafs.add(A[i]);
            if(leafs.size()==X)
            { time = i;
              break;
            }
        }
    return time;
    }
}

/*  Explaination
frog should jump when Xth leaf falls in river but he can reach Xth leaf only when all the leaf from 1-->X-1 has already fallen 
So to reach POS X+1 
it is neccesary that X unique leafs representing X unique position from 1-->X has fallen
for eg leaf (3,[1,2,3]) here X is 3 and array A is [1,2,3]
 leaf pos		        [1,2,3]
 fallenAt time given by index    0,1,2 second
 so at time == 2 seconds frog should jump
 
 eg 2	    (3,[1,2,1,2,3])
 leaf pos			[1,3,1,2,3]
 fallenAt time given by index    0,1,2,3,4 second		
 it is only at time == 4 seconds when leaf at pos 3 has fallen so frog can reach at POS 4(ie X+1) only when all the leaf 1-->X are in river
 so when Xth leaf appears & all the leaf from 1-->X-1 are fallen frog can jump
 
  when array length is 1
  pos	     [1]  
  time/index  0
 (1,[1]) time 0 second
  pos 	      [5]
  time/index  -1 
 (anyNumber other then 1,[anyNumber other then 1]) time  -1 ,frog can't reach as leaf at pos 1 has never fallen so how can we reach any other leaf 
*/



/*
 journey that I have gone through before reaching to the soln written above,
 only if I had remembered about hashset that hashset dont allow duplicate values

my first instant approach to solve the problem but then I read ....this line 
class Solution {
 public int solution(int X, int[] A)
{
  Arrays.sort(A);
  firstChanceToCrossRiverIsAtThisSecond = Arrays.binarySearch(A,X);
  return firstChanceToCrossRiverIsAtThisSecond >=0 ? firstChanceToCrossRiverIsAtThisSecond : -1;

}
}

...that the frog can cross only when leaves appear at every position across the river from 1 to X 
thats why just looking for when leaf falls at position X is not enough 
we need to make sure whether all the leaf from 1-->X-1 has fallen or not as only then frog will able to reach Xth leaf 
*/ 
 
/* 
import java.util.Arrays;
class Solution {
 public int solution(int X, int[] A)
{ 
  
  //The frog can cross only when leaves appear at every position across the river from 1 to X 
  
  if(A[0]==X)
  {   while(X!=1)
      X--;
      return -1; //already allLeafAreInPlace frog should have ideally jumped at -1 second
                         //(2, [2, 2, 2, 2, 2])}
			     //(1, [1])  0 second
  }
  int arraySize = A.length;
  int lastIndex =arraySize-1;
  if(A[arraySize-1]==X){
      while(A[lastIndex]==X){
          lastIndex--;
          }
      return lastIndex+1; // first time when X appeared (4, [4, 1, 2, 2, 3,4,4,4,])
      }
  int leafInPlace = 0;
  boolean allLeafAreInPlace = false;
  int []chkIfLeafIsAtSamePos =new int[X]; // can use arrayList to Save space
 
  int goUpTo  = 1;
  for(int i =0; i<=lastIndex; i++){
      if(allLeafAreInPlace && A[i]==X)
        {
         return i;  //worst case allLeafAreInPlace gets true at lastIndex-1
        }
       else if(A[i]<X){
          
          
          //but what if (4, [4, 1, 2, 2, 2,4,4,4,])
              //check by linear search to eliminate the chance of incrementing leafInPlace 
              //for duplicate leaf ie leaf that has fallen over same place
              for (int foundAt = 0; foundAt <goUpTo; foundAt++)
              {
                if (A[i]==chkIfLeafIsAtSamePos[foundAt])
                { break;}
                else{
                     //not found its Unique element ,add
                     chkIfLeafIsAtSamePos[foundAt+1]= A[i];
                     leafInPlace++;
                    }
              }
              
             }
          
            if(leafInPlace ==X-1){
              allLeafAreInPlace = true;
              continue;
              }
      
  }
  return -1; //else not found
  }

}
*/
