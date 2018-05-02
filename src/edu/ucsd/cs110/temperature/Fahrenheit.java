package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius()
    {
        float t = (float) ((this.getValue() - 32.0) / 1.8);
        return new Celsius(t);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return  getValue()+" F";
    }
}
