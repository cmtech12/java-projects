import java.util.Scanner;
public class Application9 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please input your command: ");
	String text = input.nextLine();
	
	switch(text) {
	case "start":
		System.out.println("Loading");
		break;
	
	case  "stop":
	System.out.println("Processing Stop"); 
	break;
	
	default:
		System.out.println("Command not valid. Please input your command: ");
		}
	}

}
//Author: Christopher Moore created on 10/09/2018//