package com.quantitymeasurement;

public class Length {
    private final double value;
    public Conversion.ConversionOfUnit unit;

    /*enum Unit{ FEET, INCH};
    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value){
        this.unit = unit;
        this.value = value;
    }
    public boolean compare(Length that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH, that.value) == 0;
        return false;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length length = (Length) obj;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

    public Length(Conversion.ConversionOfUnit unit, double value){
        this.value = value;
        this.unit = unit;
    }
    public boolean compareCheck(Length that){
        Double firstValue = this.unit.convertToInches(this.value);
        Double secondValue = that.unit.convertToInches(that.value);
        return firstValue.equals(secondValue);
    }
}
