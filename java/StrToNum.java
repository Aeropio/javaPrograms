import java.util.*;
public class StrToNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length()-1;
		int num = 0;
		int dP = 1;
		for(int i=len;i>=0;i--){
			num += (str.charAt(i)-'0')*dP;
			dP *= 10;
		}
		System.out.println(num+5);
	}
}