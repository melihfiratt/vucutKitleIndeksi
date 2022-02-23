import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		/**
		 * @author M. Firat Sen, 2022
		 */
		double weight, height, bodyMassIndex;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?: ");
		weight = input.nextDouble();
		System.out.println("What is your height?: ");
		height = input.nextDouble();
		bodyMassIndex = weight/(height*height);
		System.out.println("Body Mass Index: ");
		System.out.println(bodyMassIndex);
	}
}
