public class GroceryBill {

	public static void main(String[] args) {
		String item1 = "Milk";
        String item2 = "Butter";
        String item3 = "Cheese";
        String item4 = "Onion";

        int item1_p = 4;
        int item2_p = 3;
        int item3_p = 5;
        int item4_p = 8;

        int total_price = item1_p + item2_p + item3_p + item4_p;

        System.out.println("*******************************");
        System.out.println("Item 1: " + item1 + " Price: " + item1_p);
        System.out.println("Item 2: " + item2 + " Price: " + item2_p);
        System.out.println("Item 3: " + item3 + " Price: " + item3_p);
        System.out.println("Item 4: " + item4 + " Price: " + item4_p);
        System.out.println("===============================");
        System.out.println("Total Price: " + total_price);
	}
}