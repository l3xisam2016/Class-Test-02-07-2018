package classtest;
import java.util.Scanner;
public class phonetest {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("What is the phone brand?");
    String Pbrand1= scanner.nextLine();
	
	System.out.println("What year was the phone Released?");
	int Pyear1=scanner.nextInt();
	System.out.println("What is the price?");
	double Pprice1=scanner.nextDouble();
	System.out.println("What is the name of the phone?");
	String Pname1=scanner.nextLine();
	
	
	
	phone phone1=new phone(Pbrand1, Pyear1, Pprice1, Pname1);
	
	System.out.println(phone1.Brand);
	}

}
