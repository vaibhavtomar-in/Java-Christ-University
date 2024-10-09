import java.util.Scanner;
import java.io.IOException;
public class Main{
	public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Linux or Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error: Unable to clear console");
        }
    }
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		int choice;
		SimpleCalculator cal = new SimpleCalculator();
		while(true){
			System.out.print("to enter first number : 1\nto enter second number : 2\nto get addition result : 3\nto get subtraction result : 4\nto get multiplication result: 5\nto get division result : 6\nyour choice : ");
			choice = myObj.nextInt();
			switch(choice){
			case 1: 
				clearScreen();
				System.out.print("enter the first number : ");
				double number1 = myObj.nextDouble();
				cal.setFirstNumber(number1);
				break;
			case 2:
				clearScreen();
				System.out.print("enter the second number : ");
				double number2 = myObj.nextDouble();
				cal.setSecondNumber(number2);
				break;
			case 3:
				clearScreen();
				double sum = cal.add();
				System.out.println("The sum of " + cal.getFirstNumber() + " and " + cal.getSecondNumber() + " is " + cal.add());
				break;
			case 4:
				clearScreen();
				double diff = cal.subtract();
				System.out.println("The difference of " + cal.getFirstNumber() + " and " + cal.getSecondNumber() + " is " + cal.subtract());
				break;
			case 5:
				clearScreen();
				double multiply = cal.multiply();
				System.out.println("The product of " + cal.getFirstNumber() + " and " + cal.getSecondNumber() + " is " + cal.multiply());
				break;
			case 6:
				clearScreen();
				double quotient = cal.divide();
				System.out.println("The quotient of " + cal.getFirstNumber() + " and " + cal.getSecondNumber() + " is " + cal.divide());
				break;
			default : 
				clearScreen();
				System.out.println("invalid input");
			}
		}
		
	}
	
}