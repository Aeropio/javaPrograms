import java.util.*;

public class remDup{
	public static void main(String[] args) {
		String arr[] = {"pihu","timmy","tom","pikachu","pihu"};
		Set<String> set = new HashSet<String>();
		// for(String s:arr){
		// 	set.add(s);
		// }
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(!set.contains(arr[i])){
				set.add(arr[i]);
			}
			else{
					index=i;
			}
		}
		System.out.println(arr[index]);
	}
}