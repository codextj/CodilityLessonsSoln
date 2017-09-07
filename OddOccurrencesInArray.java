
import java.util.Arrays;

class Solution {
    
    public int solution(int[] A) {
    Arrays.sort(A);
    int num = 0;
    int countForThisNum =0;
    int OddTimeOcuuringNum =0;
    
    for(int i =0; i<A.length; i++){
        num = A[i];
        while(i <A.length && num ==A[i]){
            countForThisNum++;
            i++;
            }
        if(countForThisNum % 2 !=0)
        {   
            OddTimeOcuuringNum = num;
            break;
        }
        else{
             i--;
            }
    }
    return OddTimeOcuuringNum;
}
}

