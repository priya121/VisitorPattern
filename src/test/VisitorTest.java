package test;

import main.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    TaxVisitor taxCalculator = new TaxVisitor();
    TaxHolidayVisitor taxHolidayCalculator = new TaxHolidayVisitor();


    Necessity milk = new Necessity(1.99);
    Liquor liquor = new Liquor(11.99);
    Tobacco tobacco = new Tobacco(19.99);

    @Test
    public void calculatesPriceWithTaxForMilk() {
        assertEquals(milk.accept(taxCalculator), "Necessity item: Price with tax: 1.99");
    }
    
    @Test
    public void calculatesPriceWithTaxForLiquor() {
        assertEquals(liquor.accept(taxCalculator), "Liquor item: Price with tax: 14");
    }
    
    @Test
    public void calculatesPriceWithTaxForTobacco() {
        assertEquals(tobacco.accept(taxCalculator), "Tobacco item: Price with tax: 26");
    }

    @Test
    public void calculatesPriceWithHolidayTaxForMilk() {
        assertEquals(milk.accept(taxHolidayCalculator), "Necessity item: Price with tax: 1.99");
    }

    @Test
    public void calculatesPriceWithHolidayTaxForLiquor() {
        assertEquals(liquor.accept(taxHolidayCalculator), "Liquor item: Price with tax: 13");
    }
    
    @Test
    public void calculatesPriceWithHolidayTaxForTobacco() {
        assertEquals(tobacco.accept(taxHolidayCalculator), "Tobacco item: Price with tax: 28");
    }
}