package jumpGame2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {2,1,1,1,4};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMinimumNumberOfJumpFunction solution = new FindMinimumNumberOfJumpFunction();
		
		System.out.println("Solution: " + solution.jump(nums));
	}
}
