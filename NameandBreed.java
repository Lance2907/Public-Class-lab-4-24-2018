import java.util.Scanner;
public class NameandBreed {
public static void main (String []args){
	Cats[] NameandBreed= new Cats[3];
	// create an array of size 3
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter three breeds and names of cats");
	
	                 
	for(int i=0;i<3; i++){
String Name=scan.nextLine();
String Breed= scan.nextLine();
NameandBreed[i]= new Cats(Name,Breed);
System.out.println(NameandBreed[1]. name);
	}
}
}
