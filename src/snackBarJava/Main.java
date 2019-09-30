package snackBarJava;

public class Main
{
    private static void workWithData()
    {
        Customers c1 = new Customers("Jane", 45.25);
        Customers c2 = new Customers("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        System.out.println("*** Welcome to the Snack Bar***");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        c1.purchase(s4.getTotalCost(3));
        s4.removeQuantity(3);
        System.out.println(c1.getName() + " buys 3 " + s4.getName() + "s.");
        System.out.println(c1.getName() + " has $" + c1.getCash());
        System.out.println("There are " + s4.getQuantity() + " " + s4.getName() + "s left.");

        System.out.println("\n");

    c1.purchase(s3.getTotalCost(1));
        s3.removeQuantity(1);
        System.out.println(c1.getName() + " buys 1 " + s3.getName() + "s.");
        System.out.println(c1.getName() + " has $" + c1.getCash());
        System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + "s left.");

        System.out.println("\n");

        c2.purchase(s4.getTotalCost(2));
        s4.removeQuantity(2);
        System.out.println(c2.getName() + " buys 2 " + s4.getName() + "s.");
        System.out.println(c2.getName() + " has $" + c2.getCash());
        System.out.println("There are " + s4.getQuantity() + " " + s4.getName() + "s left");

        System.out.println("\n");

        System.out.println(c1.getName() + " had $" + c1.getCash() + ", but then found $10 on the ground.");
        c1.addCash(10);
        System.out.println(c1.getName() + " now has $" + c1.getCash());

        System.out.println("\n");

        c1.purchase(s2.getTotalCost(1));
        s2.removeQuantity(1);
        System.out.println(c1.getName() + " buys 1 " + s2.getName() + "s.");
        System.out.println(c1.getName() + " has $" + c1.getCash());
        System.out.println("There are " + s2.getQuantity() + " " + s2.getName() + "s left");

        System.out.println("\n");

        System.out.println("There were " + s3.getQuantity() + " " + s3.getName() + "s, but a shipment came in with 12 more!");
        s3.addQuantity(12);
        System.out.println("There are now " + s3.getQuantity() + " " + s3.getName() + "s in stock");

        System.out.println("\n");

        c2.purchase(s3.getTotalCost(3));
        s3.removeQuantity(3);
        System.out.println(c2.getName() + " buys 3 " + s3.getName() + "s.");
        System.out.println(c2.getName() + " has $" + c2.getCash());
        System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + "s left");
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}