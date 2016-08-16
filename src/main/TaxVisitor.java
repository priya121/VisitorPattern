package main;

public class TaxVisitor implements Visitor{
    @Override
    public String visit(Liquor liquorItem) {
        return "Liquor item: Price with tax: " + Math.round((liquorItem.getPrice() * 0.18) + liquorItem.getPrice());
    }

    @Override
    public String visit(Tobacco tobaccoItem) {
        return "Tobacco item: Price with tax: " + Math.round((tobaccoItem.getPrice() * 0.32) + tobaccoItem.getPrice());
    }

    @Override
    public String visit(Necessity necessityItem) {
        return "Necessity item: Price with tax: " + necessityItem.getPrice();
    }
}
