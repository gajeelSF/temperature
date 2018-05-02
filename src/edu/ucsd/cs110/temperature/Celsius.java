package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float t = (float) (this.getValue() * 1.8 + 32.0);
        return new Fahrenheit(t);
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue()+" C";
    }
}
