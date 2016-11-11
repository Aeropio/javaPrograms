// [1] Problem Statement - DeltaX

// Output a list from 1 to 100, one per line, with the following exceptions:
// Numbers from this list divisible by 4 should print "Delta" instead of the number.
// Numbers from this list divisible by 7 should print "X" instead of the number.
// Numbers from this list divisible by both 4 and 7 should print "DeltaX" instead of the number.


public class P1{
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%4==0 && i%7==0){
				System.out.println("DeltaX");
			}
			else if(i%7==0 && i%4!=0){
				System.out.println("X");
			}
			else if(i%4==0 && i%7!=0){
				System.out.println("Delta");
			}
			else{
				System.out.println(i);
			}
		}
	}
}
