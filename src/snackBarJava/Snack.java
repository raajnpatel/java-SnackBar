package snackBarJava;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId() {
        return id;
    }

    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }
    public void setCost()
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    public void setVendingMachineId()
    {
        this.vendingMachineId = vendingMachineId;
    }

    public int getQuantity()
    {
        return quantity;
    }
    public int addQuantity(int newQuantity)
    {
        this.quantity = newQuantity + quantity;
        return this.quantity;
    }
    public int removeQuantity(int reduceQuantity)
    {
        this.quantity = this.quantity - reduceQuantity;
        return this.quantity;
    }

    public double getTotalCost(int quantity)
    {
        return this.cost * quantity;
    }


    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                "name: " + name + "\n" +
                "quantity: " + quantity + "\n" +
                "cost: " + cost + "\n" +
                "Vending Machine id: " + vendingMachineId + "\n";
        return rtnStr;
    }

}