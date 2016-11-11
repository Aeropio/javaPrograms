import java.util.*;
public class bin
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int num = Integer.parseInt(scan.nextLine());
		//System.out.println(num);
		String str = scan.nextLine();
		//str+='e';
		//System.out.println(str);
		char[] charArray = str.toCharArray();
		int currsum=0;
		int consum=0;

		for(int i=0;i<charArray.length;i++){
			//System.out.println((i!=charArray.length-1)&&(charArray[i]!='0'));
			if(charArray[i]=='1'){
				currsum++;
				//max=sum;
			}

			else if(i!=charArray.length-1&&charArray[i]=='0'){
				currsum=0;
			}
			if(currsum>consum)
				consum = currsum;

			
		}
		//System.out.println(sum);
		System.out.println(consum);

	}
}