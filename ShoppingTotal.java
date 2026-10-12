public class ShoppingTotal{
    public static void main(String[] args){
        String productName = "PS5";
        double unitPrice = 12000.00;
        int quantity = 3;
        double totalCost = 0.0;

        totalCost = unitPrice * quantity;
        System.out.println("The total cost is: R" + totalCost + " for the product: " + productName);
         double discount = 0.0;
        if (quantity >= 3){
             discount = totalCost * 0.08;
        }
        else{
            System.out.println("You dont qualify for the dicounted amount");
        }

        double finalamount = totalCost - discount;

        System.out.println("you had a discount of: R" + discount + " on your total cost of: R" + totalCost + ", Therefore the final amount due is R:" + finalamount );

    }
}
