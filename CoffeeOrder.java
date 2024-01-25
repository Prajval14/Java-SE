public class CoffeeOrder {

	public static void main(String[] args) {
		String item1 = "French vanilla";
        String item2 = "Double double";
        String item3 = "Dark roast";
        String item4 = "Hot chocolate";
        
        String size1 = "S";
        String size2 = "M";
        String size3 = "L";
                		
        int item1_p = 2;
        int item2_p = 3;
        int item3_p = 5;
        int item4_p = 4;        

        System.out.println("Welcome to Tim Hortons");
        System.out.println("===============================");
        System.out.println("Item 1: " + item1 + " | Size: " + size1 +  " | Price: " + item1_p);
        System.out.println("Item 2: " + item2 + " | Size: " + size2 +  " | Price: " + item2_p);
        System.out.println("Item 3: " + item3 + " | Size: " + size2 +  " | Price: " + item4_p);
        System.out.println("Item 4: " + item4 + " | Size: " + size3 +  " | Price: " + item3_p);
        System.out.println("===============================");
        
        int order1 = item1_p * 4;
        int order2 = item4_p * 1;   
        int total_price = order1 + order2;
        
        System.out.println("Order 1: " + item1 + " | Quantity: " + 4);
        System.out.println("Order 2: " + item4 + " | Quantity: " + 1);
        
        System.out.println("===============================");
        System.out.println("Total Amount: " + total_price);
	}
}
