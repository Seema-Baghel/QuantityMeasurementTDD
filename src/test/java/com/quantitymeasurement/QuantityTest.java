package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
       Feet feet1 = new Feet(0.0);
       Feet feet2 = new Feet(0.0);
       Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void given1Feetand1Feet_ShouldReturnEqual(){
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual(){
        Feet feet1 = new Feet(1.0);
        Inch inch1 = new Inch(1.0);
        Assert.assertNotEquals(feet1, inch1);
    }
    @Test
    public void given1Feetand0Inch_ShouldReturnNotEqual(){
        Feet feet1 = new Feet(1.0);
        Inch inch1 = new Inch(0.0);
        Assert.assertNotEquals(feet1, inch1);
    }
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given0Inchand0Inch_ShouldReturnNotEqual(){
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given1Inchand1Inch_ShouldReturnEqual(){
        Inch inch1 = new Inch(1.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual(){
        Inch inch1 = new Inch(1.0);
        Feet feet1 = new Feet(1.0);
        Assert.assertNotEquals(feet1, inch1);
    }
    @Test
    public void given1Inchand0Feet_ShouldReturnNotEqual(){
        Feet feet1 = new Feet(0.0);
        Inch inch1 = new Inch(1.0);
        Assert.assertNotEquals(inch1, feet1);
    }
    @Test
    public void givenOnNullValue_ShouldReturnFalse(){
        Feet feet1 = new Feet(3.0);
        Feet feet2 = null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }
    @Test
    public void givenFeetObject_WhenEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        boolean typeCheck= feet1.equals(feet1);
        Assert.assertEquals(true,typeCheck);
    }

}