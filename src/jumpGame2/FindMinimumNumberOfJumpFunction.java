package jumpGame2;

public class FindMinimumNumberOfJumpFunction {
    public int jump(int[] nums) {
        int currentEnd = 0;
        
        int currentFarthest = 0;
        
        int jumpStep = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            // currentFarthest will get the farthest jump destination 
            currentFarthest = Math.max(currentFarthest, i + nums[i]);
            
            // If the current jump could reach to the end index, then we got it
            // if(currentFarthest >= nums.length - 1){
            //     // Increase the count of jump
            //     jumpStep++;
            //     break;
            // }
            
            // Only increase jump step when reach current end
            if(i == currentEnd){
                jumpStep++;
                currentEnd = currentFarthest; 
            }
        }
        
        return jumpStep;
    }
}
