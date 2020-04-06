package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    Quantity quantity;
    double inch,inch1,inch2,feet1,feet2,cm1,cm2, length1, length2,feet,yard,centimeter;

    @Before
    public void setUp() throws Exception {
        quantity = new Quantity();
    }

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
        feet1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 0.0);
        feet2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 0.0);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given0Feetand0Feet_ShouldReturnNotEqual(){
        feet1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 0.0);
        feet2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2, 0.0);
    }

    @Test
    public void givenFeetIsNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenFeetObject_WhenEqual_ShouldReturnTrue() {
        Quantity length1 = new Quantity();
        Assert.assertEquals(quantity, length1);
    }

    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck = quantity.equals(quantity);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void given2Feetand2Feet_ShouldReturnEqual(){
        feet1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 2.2);
        feet2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 2.2);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given0Inch_WhenEqual_ShouldReturnTrue() {
        inch1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 0);
        inch2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
        inch1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 0);
        inch2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 1);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenInchIsNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenInchClass_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck = quantity.equals(quantity);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void given1Inchand1Inch_ShouldReturnEqual(){
        inch1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 1.1);
        inch2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 1.1);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqual(){
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 0.0);
        feet = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 0.0);
        Assert.assertEquals(feet, inch, 0.0);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 1);
        Assert.assertNotEquals(1, inch, 0.0);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual() {
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 1);
        feet = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 1);
        Assert.assertNotEquals(feet, inch, 0.0);
    }

    @Test
    public void given1Feetand12Inch_ShouldReturnEqual() {
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 1);
        Assert.assertEquals(12, inch, 0.0);
    }

    @Test
    public void given12Inchand1Feet_ShouldReturnEqual() {
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 12);
        feet = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 1);
        Assert.assertEquals(inch, feet, 0.0);
    }
    // Yard
    @Test
    public void given1Yardand3Feet_ShouldReturnEqual() {
        feet = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 3);
        yard = quantity.unitConvertor(Quantity.ConversionOfUnitType.YARD, 1);
        Assert.assertEquals(feet, yard, 0.0);
    }

    @Test
    public void given3Feetand1Yard_ShouldReturnEqual() {
        feet = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 3);
        yard = quantity.unitConvertor(Quantity.ConversionOfUnitType.YARD, 1);
        Assert.assertEquals(yard, feet, 0.0);
    }

    @Test
    public void given1Feetand1Yard_ShouldReturnNotEqual() {
        feet = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 1);
        yard = quantity.unitConvertor(Quantity.ConversionOfUnitType.YARD, 1);
        Assert.assertNotEquals(yard, feet, 0.0);
    }

    @Test
    public void given1Inchand1Yard_ShouldReturnNotEqual() {
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 1);
        yard = quantity.unitConvertor(Quantity.ConversionOfUnitType.YARD, 1);
        Assert.assertNotEquals(inch, yard, 0.0);
    }

    @Test
    public void given1Yardand36Inch_ShouldReturnEqual() {
        yard = quantity.unitConvertor(Quantity.ConversionOfUnitType.YARD, 1);
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 36);
        Assert.assertEquals(inch, yard, 0.0);
    }

    @Test
    public void given36Inchand1Yard_ShouldReturnEqual() {
        yard = quantity.unitConvertor(Quantity.ConversionOfUnitType.YARD, 1);
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 36);
        Assert.assertEquals(inch, yard, 0.0);
    }
    //centimeter
    @Test
    public void given0Centimeterand0Centimeter_ShouldReturnEqual() {
        cm1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.CENTIMETER, 0);
        cm2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.CENTIMETER, 0);
        Assert.assertEquals(cm1,cm2,0.0);
    }

    @Test
    public void given0Centimeterand1Centimeter_ShouldReturnNotEqual() {
        cm1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.CENTIMETER, 0);
        cm2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.CENTIMETER, 1);
        Assert.assertNotEquals(cm1,cm2,0.0);
    }

    @Test
    public void givenCentimeterNull_ShouldReturnEqual() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void given2Inchand5Centimeter_ShouldReturnEqual() {
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 2);
        cm1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.CENTIMETER, 5);
        Assert.assertEquals(inch,cm1,0.0);
    }
}
