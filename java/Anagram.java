import java.util.*;

public class Anagram{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String input2 = sc.nextLine();

		ArrayList<Character> arr2 = out(input);
		ArrayList<Character> arr1 = out(input2);
		System.out.println(arr2);
		System.out.println(arr1);
		if(arr1.equals(arr2)){
			System.out.println("they are anagrams");
		}
		else{
			System.out.println("they r not anagrams");
		}



	}
	public static ArrayList<Character> out(String input){
			ArrayList<Character> arr = new ArrayList<Character>();
			for(int i=0;i<input.length();i++){
				if(input.charAt(i)!=' ')
				arr.add(input.charAt(i));
		}
		Collections.sort(arr);
		return arr;

	}
}