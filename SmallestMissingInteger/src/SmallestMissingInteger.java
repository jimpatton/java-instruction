import java.util.*;
public class SmallestMissingInteger {

	public static void main(String[] args) {
		

		class Solution {
		    public int solution(int[] A) {
		        int N = A.length;
		        boolean[] present = new boolean[N + 1]; // Only need to track up to N

		        for (int num : A) {
		            if (num > 0 && num <= N) {
		                present[num] = true;
		            }
		        }

		        for (int i = 1; i <= N; i++) {
		            if (!present[i]) {
		                return i;
		            }
		        }

		        return N + 1; // All 1..N are present
		    }
		}

	}

}
