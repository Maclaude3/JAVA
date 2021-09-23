import java.util.Scanner;

public class OlaMundo{	

	public static void main(String[]args){
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("\nDigite a mensagem: ");
		String msg = scn.next();
		
		System.out.println(msg);
	}
		
}
