package com.quantitymeasurement;

public class Length {

    public enum ConversionOfUnitType {
        FEET(1*12.0),
        INCH(1.0),
        YARD(1*36.0),
        CENTIMETER(1/2.5),
        GALLON(1*3.785),
        LITRE(1.0),
        MILLILITRE(1/1000.0),
        KILOGRAMS(1.0),
        GRAMS(1/1000.0),
        TONNE(1*1000.0),
        FAHRENHEIT(1.0),
        CELSIUS(9/5.0);

        public Double type;
        ConversionOfUnitType(Double type){
            this.type=type;
        }

        double getType(){
            return type;
        }
    }
    public double unitConvertor(ConversionOfUnitType unit, double value) {
        if(unit == ConversionOfUnitType.CELSIUS) {
            return value*unit.getType()+32;
        }
        return value*unit.getType();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ) return true;
        if(this.getClass() == obj.getClass())
            return true;
        return false;
    }
}
