package main;

public interface Visitable {
    String accept(Visitor visitor);
}
