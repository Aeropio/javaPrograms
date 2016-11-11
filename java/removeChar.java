import java.util.*;
public class removeChar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char remove = 'a';
		String arr[] = str.split("a");
		String output="";
		for(String s:arr){
			output+=s;
		}
		System.out.println(output);
	}
	//System.out.println();
}