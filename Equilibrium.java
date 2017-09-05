

public class Solution { 
   
public static int solution(int[] A){

//partition begins with index 1
if(A.length==2){
   return  Math.abs((A[0])-(A[1]));
}
//look commented code below we can calculate sum of all elements in array in different way 
//and I think it should work faster then this traditional old fashion way of finding arraySum when 
//number of elements in array is very large;
//but maybe due Locality of reference // cache hit will be higher when we access array sequentially so traditional good old way 
//is porobably faster
int ArraySum =0;
int lastIndex = A.length -1;
for(int i = 0; i <= lastIndex; i++){
	ArraySum += A[i];	
}
//System.out.println("ArraySum "+ArraySum);

int partition1Sum = A[0];
int partition2Sum = ArraySum - partition1Sum; // Math.abs(partition1Sum - ArraySum)
int minDifference = Math.abs(partition1Sum - partition2Sum);
int addTo1RemoveFrom2This;
int minForCurrentPartitions;
/*
lastPartition config
partition1Sum = indx 0 ---> lastindx -1  
partition1Sum = lastindx
*/
int i = 1;

while(i< lastIndex-1){
addTo1RemoveFrom2This = A[i];
partition1Sum += addTo1RemoveFrom2This; //A[i]
partition2Sum -= addTo1RemoveFrom2This; //A[i]

minForCurrentPartitions = Math.abs(partition1Sum - partition2Sum);

minDifference = minDifference <= minForCurrentPartitions ? minDifference : minForCurrentPartitions;
i++;

}
return minDifference;
}
}



/* 
int ArraySum =0;
int lastIndex = A.length -1;
//i --> element from left
//lastIndex -i --> element from right
for(int i = 0; i <= lastIndex/2; i++){
    if(i == (lastIndex-i)){
        ArraySum += A[i];
        break;
        }
	ArraySum += (A[i] + A[lastIndex-i]);
}
//System.out.println("ArraySum "+ArraySum);
*/
