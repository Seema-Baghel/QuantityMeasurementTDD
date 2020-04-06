package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    Quantity quantity;
    double inch,inch1,inch2,feet1,feet2,cm1,cm2, length1, length2,feet,yard,centimeter,volume1,volume2,gallon,litre,millilitre,weight1;
    double weight2,kilograms,grams,tonne;

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
    public  void given0Feetand0Inch_ShouldReturnEqual(){
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
    @Test
    public void given2InchAnd2Inch_ShouldReturnEqualFourInches() {
        inch1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 2);
        inch2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 2);
        inch = inch1+inch2;
        Assert.assertEquals(4,inch,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnEqualFourteenInches() {
        feet1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 1);
        inch1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 2);
        inch = feet1+inch1;
        Assert.assertEquals(14,inch,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualTwentyFourInches() {
        feet1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET,1);
        feet2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.FEET, 1);
        inch = feet1+feet2;
        Assert.assertEquals(24,inch,0.0);
    }

    @Test
    public void given2InchAnd2andHalfCentimeter_ShouldReturnEqualThreeInches() {
        inch = quantity.unitConvertor(Quantity.ConversionOfUnitType.INCH, 2);
        cm1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.CENTIMETER, 2.5);
        inch = inch+cm1;
        Assert.assertEquals(3,inch,0.0);
    }
    //Gallion , milliliter, liter //
    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() {
        volume1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.GALLON, 0);
        volume2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.GALLON, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void given0GallonAnd1Gallon_ShouldReturnNotEqual() {
        volume1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.GALLON, 0);
        volume2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.GALLON, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenGallonNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void given0LitreAnd0Litre_ShouldReturnEqual() {
        volume1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.LITRE, 0);
        volume2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.LITRE, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void given0LitreAnd1Litre_ShouldReturnNotEqual() {
        volume1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.LITRE, 0);
        volume2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.LITRE, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenLitreNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void given0MillilitreAnd0Millilitre_ShouldReturnEqual() {
        volume1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.MILLILITRE, 0);
        volume2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.MILLILITRE, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void given0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        volume1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.MILLILITRE, 0);
        volume2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.MILLILITRE, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenMillilitreNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertEquals(true,nullCheck);
    }
    @Test
    public void given1GallonAndThreePointSeventyEightLitres_ShouldReturnEqual() {
        gallon = quantity.unitConvertor(Quantity.ConversionOfUnitType.GALLON, 1);
        litre = quantity.unitConvertor(Quantity.ConversionOfUnitType.LITRE, 3.78);
        Assert.assertEquals(litre,gallon,0.0);
    }

    @Test
    public void given1LitreAnd1000Millilitre_ShouldReturnEqual() {
        litre = quantity.unitConvertor(Quantity.ConversionOfUnitType.LITRE, 1);
        millilitre = quantity.unitConvertor(Quantity.ConversionOfUnitType.MILLILITRE, 1000);
        Assert.assertEquals(millilitre,litre,0.0);
    }
    @Test
    public void given1GallonAndThreePointSeventyEightLitres_ShouldReturnEqualSevenPointFiftySevenLitres() {
        gallon = quantity.unitConvertor(Quantity.ConversionOfUnitType.GALLON, 1);
        litre = quantity.unitConvertor(Quantity.ConversionOfUnitType.LITRE, 3.785);
        litre=gallon+litre;
        Assert.assertEquals(7.57,litre,0.0);
    }

    @Test
    public void given1LitreAnd1000Millilitre_ShouldReturnEqualTwoLitres() {
        litre = quantity.unitConvertor(Quantity.ConversionOfUnitType.LITRE, 1);
        millilitre = quantity.unitConvertor(Quantity.ConversionOfUnitType.MILLILITRE, 1000);
        litre=litre+millilitre;
        Assert.assertEquals(2,litre,0.0);
    }
    // kilograms, grams, tonne
    @Test
    public void given0KilogramAnd0Kilograms_ShouldReturnEqual() {
        weight1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.KILOGRAMS, 0);
        weight2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.KILOGRAMS, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void given0KilogramAnd1Kilograms_ShouldReturnNotEqual() {
        weight1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.KILOGRAMS, 0);
        weight2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.KILOGRAMS, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenKilogramNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void given0GramAnd0Grams_ShouldReturnEqual() {
        weight1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.GRAMS, 0);
        weight2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.GRAMS, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void given0GramAnd1Grams_ShouldReturnEqual() {
        weight1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.GRAMS, 0);
        weight2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.GRAMS, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenGramNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void given0TonneAnd0Tonne_ShouldReturnEqual() {
        weight1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.TONNE, 0);
        weight2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.TONNE, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void given0TonneAnd1Tonne_ShouldReturnNotEqual() {
        weight1 = quantity.unitConvertor(Quantity.ConversionOfUnitType.TONNE, 0);
        weight2 = quantity.unitConvertor(Quantity.ConversionOfUnitType.TONNE, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenTonneNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = quantity.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void given1KilogramAnd1000Grams_ShouldReturnEqual() {
        kilograms = quantity.unitConvertor(Quantity.ConversionOfUnitType.KILOGRAMS, 1);
        grams = quantity.unitConvertor(Quantity.ConversionOfUnitType.GRAMS, 1000);
        Assert.assertEquals(grams,kilograms,0.0);
    }

    @Test
    public void given1TonneAnd1000Kilograms_ShouldReturnEqual() {
        tonne = quantity.unitConvertor(Quantity.ConversionOfUnitType.TONNE, 1);
        kilograms = quantity.unitConvertor(Quantity.ConversionOfUnitType.KILOGRAMS, 1000.0);
        Assert.assertEquals(tonne,kilograms,0.0);
    }

    @Test
    public void given1TonneAnd1000Grams_ShouldReturnEqualToThousandAndOneKilograms() {
        tonne = quantity.unitConvertor(Quantity.ConversionOfUnitType.TONNE, 1);
        grams = quantity.unitConvertor(Quantity.ConversionOfUnitType.GRAMS, 1000.0);
        double kilograms = tonne + grams;
        Assert.assertEquals(1001, kilograms, 0.0);
    }
}
