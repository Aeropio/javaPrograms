import java.util.*;

class Pets
{

	String petName;
	
	Pets(String petName)
	{
		this.petName =  petName;
		
	}
	public String getPetName()
	{
		return petName;
	}
	
}
class PetsHouse
{
	ArrayList<Pets> pets = new ArrayList<Pets>();
	int count = 0;
	public void addPetToHome(Pets obj)
	{
		if(count<=20)
		{
			pets.add(obj);
			count++;
		}
		else if(count>20 || count<0)
		{
			System.out.println("Sorry ,the house is full!!Better luck next time");
		}


	}
	public void adoptPet()
	{
		pets.remove(0);
	}
	public void showListofPets()
	{
		for(Pets obj:pets)
		{
			System.out.println(obj.getPetName());
		}
	}
}

public class PetManagement
{
	public static void main(String[] args) {
		int n=0;
		PetsHouse house = new PetsHouse();
		switch(n)
		{
			case 1:System.out.println("Enter the name of the dog");
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			Pets obj = new Pets(name);
			house.addPetToHome(obj);

			break;
			case 2:System.out.println("You have entered the option to adopt");
			

			break;
			case 3:
			break;
			default:System.out.println("please enter a valid option from 1 to 3");
		}
		//Pets obj = new Pets("Scooby");
		//Pets obj2 = new Pets("Pihu");
		
		//house.addPetToHome(obj);
		//house.addPetToHome(obj2);
		System.out.println("before adopting");
		house.showListofPets();
		house.adoptPet();
		System.out.println("after adopting");
		house.showListofPets();


		
	}
}