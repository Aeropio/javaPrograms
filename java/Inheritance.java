import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    
    public Student(String firstName, String lastName, int id, int testScores[]) {
    	super(firstName,lastName,id);
    	this.testScores = testScores;
    }

    public char calculate() {
    	int result = 0;
    	for(int i = 0; i<testScores.length; i++){
    			result = result+testScores[i];
    	    }

    	    result = result/testScores.length;
    	    if(result>=90 && result<=100){
    	    	return 'O';
    	    }
    	    else if(result>=80 && result<90){
    	    	return 'E';
    	    }
    	    else if (result>=70 && result<80){
    	    	return 'A';
    	    }
    	    else if (result>=70 && result<55){
    	    	return 'P';
    	    }
    	    else if(result>=55 && result<40){
    	    	return 'P';
    	    }
    	    else 
    	    	return 'T';
    	}
   
}


class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}