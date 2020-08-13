import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int prc;
        int qn;
        String str;
        ItemToPurchase Item1 = new ItemToPurchase();
        ItemToPurchase Item2 = new ItemToPurchase();

        System.out.print("Item1\nEnter the item name:\n");
        str = scnr.nextLine();
        Item1.setName(str);

        System.out.println("Enter the item price:");
        prc = scnr.nextInt();
        Item1.setPrice(prc);

        System.out.println("Enter the item quantity:");
        qn = scnr.nextInt();
        Item1.setQuantity(qn);

        scnr.nextLine();

        System.out.print("Item2\nEnter the item name:\n");
        str = scnr.nextLine();
        Item2.setName(str);

        System.out.println("Enter the item price:");
        prc = scnr.nextInt();
        Item2.setPrice(prc);

        System.out.println("Enter the item quantity:");
        qn = scnr.nextInt();
        Item2.setQuantity(qn);

        System.out.println("TOTAL COST:");
        System.out.println(Item1.getName() + ": " + Item1.getQuantity() + " @ $" + Item1.getPrice() + " = $" + Item1.getPrice() * Item1.getQuantity());
        System.out.println(Item2.getName() + ": " + Item2.getQuantity() + " @ $" + Item2.getPrice() + " = $" + Item2.getPrice() * Item2.getQuantity());
        System.out.println("Total: $" + (Item1.getPrice() * Item1.getQuantity() + Item2.getPrice() * Item2.getQuantity()));
    }
}
