
public class LCTwoSum {

	public static void main(String[] args) {

		//test 1
		int[] nums = { 2, 7, 11, 15 };
		int[] indicies = twoSum(nums,9);
		displayResults(indicies, "Test Case 1");
		
		//test 2
		nums = new int[] {3,2,4};
		indicies = twoSum(nums, 6);
		displayResults(indicies, "Test Case 2");
		
		//test 3
		nums = new int[] {3,3};
		indicies = twoSum(nums, 6);
		displayResults(indicies, "Test Case 3");
		
	}

	private static void displayResults(int[] indicies, String string) {
		System.out.println(string);
		for (int i : indicies) {
            System.out.print(i + " ");           
        }	
		System.out.println();
	}

	public static int[] twoSum(int[] nums, int target) {
		//nums - array of ints, one pair of numbers, summed = target
		//return indicies of those 2 numbers
		int[] indicies = new int[2];
		//1st number
		Boolean found = false;
		for (int i = 0; i<nums.length; i++) {
			if (found) {
				break;
			}
			//2nd number
			for(int j = 0; j<nums.length; j++) {
				if (i!=j) {
					int sum = nums[i] + nums[j];
					if (sum == target) {
						//found indicies
						indicies[0] = i;
						indicies[1] = j;
						found = true;
						break;
						
					}
				}
			}
		}
		return indicies;
	}

}
