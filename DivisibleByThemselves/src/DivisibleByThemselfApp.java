import java.util.ArrayList;
import java.util.List;

public class DivisibleByThemselfApp {

	public static void main(String[] args){
	// find numbers divisible by themselves (is 23 divisible by 2 and 3
	List<Integer> nums = new ArrayList<>();
	//loop 1-100
	for(int nbr = 1; nbr<=200; nbr++) {
	//if so put in array
	// break number down into digits (int 57 becomes int 5 and  int 7)
	String nbrString = Integer.toString(nbr);
	char[] digitsCharArray = nbrString.toCharArray();
	 List<Integer> digitsIntList = new ArrayList<>();
     for (char c : digitsCharArray) {
         digitsIntList.add(Integer.parseInt(String.valueOf(c)));
     }
     //is number evenly divisible by both digits?(57%5==0?  & 57%7==0?)
     boolean include = true;
     for (int d: digitsIntList) {
    	 if (d==0) {
    		 include = false;
    		 break;
    	 }
    	 else if (nbr % d!=0) {
    		 include=false;
    		 break;
    	 }   	 
    	 
     }
     if (include) {
    	 nums.add(nbr);
     }     
	
	}
	nums.stream().forEach(n-> System.out.println(n));
	
}
}
