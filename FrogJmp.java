class Solution {
    public int solution(int X, int Y, int D) {
     //X frog pos
     //Y destination 
     //D jumpDist 
	 //either make X , Y, D double or use cast to double else Math.ceil doesn't work properly
  	 
     return (int)Math.ceil( (double)(Y-X)/D ); 
     
    }
}
