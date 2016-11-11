public class Bin{
	public static void main(String[] args) {
		//int bin = 111000;
		String str = "1110001100";
		//String str = Integer.toString(bin);
		int dec=0;
		int index=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			dec+= Integer.parseInt(""+str.charAt(i))*power(2,index);
			index++;
		}
		System.out.println(dec);
	}
	public static int power(int k,int i){
		int res=1;
		for(int j=0;j<i;j++){
			res=res*k;
		}
		return res;
	}
}