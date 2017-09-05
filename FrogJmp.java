class Solution {
    public int solution(int X, int Y, int D) {
     //X frog pos 
     //Y destination 
     //D jumpDist 
	 
  	//actualDistance = Y-X
	//noOfJumpReqToReachOrCrossY = actualDistance/distanceThatWeCanCoverInOneJump
	//since frog can either jump or not dist D,noOfJumpReqToReachOrCrossY must be a integer therefore if it comes out to be in decimal
	//for eg 2.5 ie 2.5 is minNo. of jump required to cover the actualDistance, we would roundUp 2.5 to 3 
	//as if we roundDown frog would not cover the actualDistance and hence not able to cross/reach Y so to make sure frog do we roundUp
	//either make X , Y, D double or use cast to double else Math.ceil doesn't work properly
     return (int)Math.ceil( (double)(Y-X)/D ); 
     
    }
}
