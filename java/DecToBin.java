import java.util.*;
public class DecToBin{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int tmp = dec;
		String str = "";
		while(tmp>0){
			str+=tmp%2;
			tmp=tmp/2;
		}
		//System.out.println(str);
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}