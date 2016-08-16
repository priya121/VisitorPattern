package main;

public class Necessity implements Visitable {
    private double price;

    public Necessity (double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
