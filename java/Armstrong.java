import java.util.*;
public class Armstrong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = Integer.toString(n);
		String arr[] = str.split("");
		int ele = 0;
		int result = 0;
		for(String s:arr){
			ele = Integer.parseInt(s);
			result+=(ele*ele*ele);

		}
		System.out.println(result);
		if(n==result){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}