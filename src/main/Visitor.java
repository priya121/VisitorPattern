package main;

public interface Visitor {
    String visit(Liquor liquorItem);
    String visit(Tobacco tobaccoItem);
    String visit(Necessity necessityItem);
}
