import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		
		String gender;
		Scanner scan=new Scanner (System.in);
		double height,clothesprice,totalprice;
		System.out.println("Enter your gender pls: ");
		gender=scan.nextLine();
		
		if( gender.equals ("m")||gender.equals ("M")||gender.equals("male")||gender 
				.equals("Male")||gender.equals("MALE"))
	        {
	            System.out.println("Types of clothes that we have for you are T-shirts,Shortpants and Jackets.");
	            System.out.println("--------------------------------------------------------------------");
	            
	    System.out.println("Enter your height in cm pls: ");
	    height= scan.nextDouble();
	    	    
	    if (height <= 182)
	    System.out.println("Your range size is from XS until L");
	    else 
	    System.out.println("Your range size is from XL until XXL");
	    
	    System.out.println("--------------------------------------------------------------------");

		System.out.println("Pls enter your code: ");
		int Code= scan.nextInt();
	    System.out.println("Quantity of clothes that you want to buy: ");
		int quantity= scan.nextInt();
		if (Code == 1)
			System.out.println("Tshirts/Blouse");	
			
			else if (Code == 2)
			System.out.println("Shortpants/Skirts");	
				
			else if (Code ==3)
			System.out.println("Jackets/Hoodies");	
				
	    
	    for(int counter=0;counter<6;counter--);
    	System.out.println("Enter clothesprice: ");
    	clothesprice=scan.nextDouble();
    	totalprice= clothesprice*quantity;
    	System.out.println("The total to be paid: "+totalprice);
    	System.out.println("Thankyou for shopping with us.");
	            
	    }
		if( gender.equals ("f")||gender.equals("F")||gender.equals("female")||gender 
	                        .equals("Female")||gender.equals("FEMALE"))
	                    {
	                        System.out.println("Types of clothes that we have for you are Blouse,Skirts and Hoodies.");
	                        System.out.println("--------------------------------------------------------------------");
	                                   
	    System.out.println("Enter your height in cm pls: ");
	    height= scan.nextDouble();
	    
	    if (height <= 182)
	    	System.out.println("Your range size is from XS until L");
	    else 
	    	System.out.println("Your range size is from XL until XXL");
        System.out.println("--------------------------------------------------------------------");

		System.out.println("Pls enter your code: ");
		int Code= scan.nextInt();
	    System.out.println("Quantity of clothes that you want to buy: ");
		int quantity= scan.nextInt();
		if (Code == 1)
			System.out.println("Tshirts/Blouse");	
			
			else if (Code == 2)
			System.out.println("Shortpants/Skirts");	
				
			else if (Code ==3)
			System.out.println("Jackets/Hoodies");	
				
	    
	    for(int counter=0;counter<6;counter--);
    	System.out.println("Enter clothesprice: ");
    	clothesprice=scan.nextDouble();
    	totalprice= clothesprice*quantity;
    	System.out.println("The total to be paid: "+totalprice);
    	System.out.println("Thankyou for buying with us");

	    
	    
	    
	    
	    
	    
	    }
	    
	    
	            }
	    	
	}
	        
	

