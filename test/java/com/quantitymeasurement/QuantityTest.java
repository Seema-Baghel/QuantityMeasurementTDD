package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
        Length length = new Length();
        double feet1 = length.unitConvertor(Length.ConversionOfUnitType.FEET, 0.0);
        double feet2 = length.unitConvertor(Length.ConversionOfUnitType.FEET, 0.0);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given0Feetand0Feet_ShouldReturnNotEqual(){
        Length length = new Length();
        double feet1 = length.unitConvertor(Length.ConversionOfUnitType.FEET, 0.0);
        double feet2 = length.unitConvertor(Length.ConversionOfUnitType.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2, 0.0);
    }

    @Test
    public void givenFeetIsNull_WhenEqual_ShouldReturnTrue() {
        Length length = new Length();
        boolean nullCheck = length.equals(null);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenFeetObject_WhenEqual_ShouldReturnTrue() {
        Length length = new Length();
        Length length1 = new Length();
        Assert.assertEquals(length, length1);
    }

    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        Length length = new Length();
        boolean typeCheck = length.equals(length);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void given2Feetand2Feet_ShouldReturnEqual(){
        Length length = new Length();
        double feet1 = length.unitConvertor(Length.ConversionOfUnitType.FEET, 2.2);
        double feet2 = length.unitConvertor(Length.ConversionOfUnitType.FEET, 2.2);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given0Inch_WhenEqual_ShouldReturnTrue() {
        Length length = new Length();
        double inch1 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 0);
        double inch2 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
        Length length = new Length();
        double inch1 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 0);
        double inch2 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 1);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenInchIsNull_WhenEqual_ShouldReturnTrue() {
        Length length = new Length();
        boolean nullCheck = length.equals(null);
        Assert.assertEquals(true, nullCheck);
    }


    @Test
    public void givenInchClass_WhenEqual_ShouldReturnTrue() {
        Length length = new Length();
        boolean typeCheck = length.equals(length);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void given1Inchand1Inch_ShouldReturnEqual(){
        Length length = new Length();
        double inch1 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 1.1);
        double inch2 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 1.1);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public  void given0Feetand0Inch_ShouldReturnEqual(){
        Length length = new Length();
        double inch = length.unitConvertor(Length.ConversionOfUnitType.FEET, 0.0);
        double feet = length.unitConvertor(Length.ConversionOfUnitType.INCH, 0.0);
        Assert.assertEquals(feet, inch, 0.0);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        Length length = new Length();
        double inch = length.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        Assert.assertNotEquals(1, inch, 0.0);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual() {
        Length length = new Length();
        double inch = length.unitConvertor(Length.ConversionOfUnitType.INCH, 1);
        double feet = length.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        Assert.assertNotEquals(feet, inch, 0.0);
    }

    @Test
    public void given1Feetand12Inch_ShouldReturnEqual() {
        Length length = new Length();
        double inch = length.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        Assert.assertEquals(12, inch, 0.0);
    }

    @Test
    public void given12Inchand1Feet_ShouldReturnEqual() {
        Length length = new Length();
        double inch = length.unitConvertor(Length.ConversionOfUnitType.INCH, 12);
        double feet = length.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        Assert.assertEquals(inch, feet, 0.0);
    }
    // Yard
    @Test
    public void given1Yardand3Feet_ShouldReturnEqual() {
        Length length = new Length();
        double feet = length.unitConvertor(Length.ConversionOfUnitType.FEET, 3);
        double yard = length.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        Assert.assertEquals(feet, yard, 0.0);
    }

    @Test
    public void given3Feetand1Yard_ShouldReturnEqual() {
        Length length = new Length();
        double feet = length.unitConvertor(Length.ConversionOfUnitType.FEET, 3);
        double yard = length.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        Assert.assertEquals(yard, feet, 0.0);
    }

    @Test
    public void given1Feetand1Yard_ShouldReturnNotEqual() {
        Length length = new Length();
        double feet = length.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        double yard = length.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        Assert.assertNotEquals(yard, feet, 0.0);
    }

    @Test
    public void given1Inchand1Yard_ShouldReturnNotEqual() {
        Length length = new Length();
        double inch = length.unitConvertor(Length.ConversionOfUnitType.INCH, 1);
        double yard = length.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        Assert.assertNotEquals(inch, yard, 0.0);
    }

    @Test
    public void given1Yardand36Inch_ShouldReturnEqual() {
        Length length = new Length();
        double yard = length.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        double inch = length.unitConvertor(Length.ConversionOfUnitType.INCH, 36);
        Assert.assertEquals(inch, yard, 0.0);
    }

    @Test
    public void given36Inchand1Yard_ShouldReturnEqual() {
        Length length = new Length();
        double yard = length.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        double inch = length.unitConvertor(Length.ConversionOfUnitType.INCH, 36);
        Assert.assertEquals(inch, yard, 0.0);
    }
    //centimeter
    @Test
    public void given0Centimeterand0Centimeter_ShouldReturnEqual() {
        Length length = new Length();
        double cm1 = length.unitConvertor(Length.ConversionOfUnitType.CENTIMETER, 0);
        double cm2 = length.unitConvertor(Length.ConversionOfUnitType.CENTIMETER, 0);
        Assert.assertEquals(cm1,cm2,0.0);
    }

    @Test
    public void given0Centimeterand1Centimeter_ShouldReturnNotEqual() {
        Length length = new Length();
        double cm1 = length.unitConvertor(Length.ConversionOfUnitType.CENTIMETER, 0);
        double cm2 = length.unitConvertor(Length.ConversionOfUnitType.CENTIMETER, 1);
        Assert.assertNotEquals(cm1,cm2,0.0);
    }

    @Test
    public void givenCentimeterNull_ShouldReturnEqual() {
        Length length = new Length();
        boolean nullCheck = length.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void given2Inchand5Centimeter_ShouldReturnEqual() {
        Length length = new Length();
        double inch = length.unitConvertor(Length.ConversionOfUnitType.INCH, 2);
        double cm = length.unitConvertor(Length.ConversionOfUnitType.CENTIMETER, 5);
        Assert.assertEquals(inch,cm,0.0);
    }
    @Test
    public void given2InchAnd2Inch_ShouldReturnEqualFourInches() {
        Length length = new Length();
        double inch1 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 2);
        double inch2 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 2);
        double inch = inch1+inch2;
        Assert.assertEquals(4,inch,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnEqualFourteenInches() {
        Length length = new Length();
        double feet1 = length.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        double inch1 = length.unitConvertor(Length.ConversionOfUnitType.INCH, 2);
        double inch = feet1+inch1;
        Assert.assertEquals(14,inch,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualTwentyFourInches() {
        Length length = new Length();
        double feet1 = length.unitConvertor(Length.ConversionOfUnitType.FEET,1);
        double feet2 = length.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        double inch = feet1+feet2;
        Assert.assertEquals(24,inch,0.0);
    }

    @Test
    public void given2InchAnd2andHalfCentimeter_ShouldReturnEqualThreeInches() {
        Length length = new Length();
        double inch = length.unitConvertor(Length.ConversionOfUnitType.INCH, 2);
        double cm = length.unitConvertor(Length.ConversionOfUnitType.CENTIMETER, 2.5);
        inch = inch+cm;
        Assert.assertEquals(3,inch,0.0);
    }

}
