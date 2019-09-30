package snackBarJava;

public class Customers {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cash;

    public Customers(String name, double cash) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }
    public double addCash(double deposit)
    {
        this.cash = this.cash + deposit;
        return this.cash;
    }
    public double purchase (double withdraw)
    {
        this.cash = this.cash - withdraw;
        return this.cash;
    }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "name: " + name + "\n" +
                        "cash: " + cash + "\n";
        return rtnStr;
    }
}