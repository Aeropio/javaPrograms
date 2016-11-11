
import java.util.*;
public class P2{
		static int del = 0;
		static int numLeft = 0;
		static ArrayList<Integer> sub = new ArrayList<Integer>();
		//static ArrayList<Integer> fin = new ArrayList<Integer>();

	public static ArrayList<Integer> winner(ArrayList<Integer> children,int numWords)
		{
			if(children.size()==1){
				System.out.println("hhhhhhhhh");
				return children;
			}
			else{
					System.out.println("inside else ...children size is "+children.size());
					for(int i=0;i<children.size();i++){
						
						if(numWords>children.size()){
							System.out.println("3rd time");
							children.remove((numWords%children.size())-1);
						}
						else if(numWords == children.size()){
							
							children.remove(children.size()-1);
						}
						else if(numWords<children.size()){
							//System.out.println("1st time");
							children.remove(numWords-1);

						}
						//numLeft = children.size()-(del);
						for(int k=0;k<del;k++){
							sub.add(children.get(k));
							
						}
						for(int k=0;k<del;k++){
							//sub.add(children.get(k));
							children.remove(0);
							
						}
						

					}
					
	   
					
					for(int i=0;i<sub.size();i++){
						children.add(sub.get(i));
					}
					sub.clear();
					children =  winner(children,numWords);
					
				
		}
		return children;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String arr[] = input.split(" ");
		int numChild = Integer.parseInt(arr[0]);
		int numWords = Integer.parseInt(arr[1]);
		ArrayList<Integer> children = new ArrayList<Integer>();
		for(int i=1;i<=numChild;i++){
			children.add(i);
		}
		//arraylist of children
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		// while(children.size()!=1){
		// 	children = winner(children,numWords);
		// }
		// if(children.size()==1){
		// 	//return children.get(0);
		// 	System.out.println(children.get(0));
		// }
		// else
		// {
		// 	System.out.println("hello");
		// 	children = winner(children,numWords);
		// }
		//System.out.println(children.get(0));
		result = winner(children,numWords);

		//System.out.println(children);
		// System.out.println("the sub is ");
		// System.out.println(sub);
		//System.out.println(fin);
		//System.out.println(numLeft);
		System.out.println(result.get(0));

		// for(int i=0;i<result.size();i++){
		// 	System.out.println(result.get(i));
		// }
		
		
		
	}
}
