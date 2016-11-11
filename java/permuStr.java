import java.util.*;

public class permuStr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> arr = new ArrayList<String>();
		String s = "";
		for(int i=0;i<str.length()-1;i++){
			for(int j=i+1;j<str.length();j++){
				s=str.substring(i,j+1);
				arr.add(s);
			}
		}
		System.out.println(arr);
	}
}