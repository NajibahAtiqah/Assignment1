import java.util.Scanner;
public class assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//TOPIC: CLOTHES
		// The program should ask detail personal background of the customer
		//The program should ask what product or services they provide
		//Determine what price per quantity 
		//The program should ask the customer how many item and quantity OR how many services they would like to order
		//Calculate the total price need to be paid

		
		System.out.print("Enter your name: ");
		String name= sc.next();
		System.out.print("Enter your age: ");
		int age= sc.nextInt();
		System.out.print("Enter your weight: ");
		double weight=sc.nextDouble();
		System.out.print("Enter your height; ");
		double height=sc.nextDouble();
		System.out.print("Enter your gender; ");
		char gender=sc.next().charAt(0);
		
		
		Scanner in = new Scanner (System.in);
		double clothesprice = 0.00;
		double Totalprice = 0.00;

		System.out.println("Type of clothes we sell: 1.Shirt 2.Blouse 3.Trousers");
		System.out.println("Service that we provide: 1.Plasticbag 2.PaperBag");
		
		System.out.println();
		System.out.print("What kind of clothes you would like to buy: ");
		int CustClothes= in.nextInt();
		System.out.println("Quantity of clothes that you want to buy: ");
		int Quantity= in.nextInt();
		
		
		
		if (CustClothes == 1);
			clothesprice= 15 * Quantity;
			
		if  (CustClothes == 2);
		clothesprice= 25 * Quantity;
		
		if  (CustClothes ==3);
		clothesprice= 35 * Quantity;
		
		
		
		Totalprice= clothesprice;
		
		System.out.println("Price to be paid : RM" + Totalprice);
		System.out.println("Thankyouu for your purchase at njbhtqh.co.Pls stay safe!");
		

		

		

	}

}
