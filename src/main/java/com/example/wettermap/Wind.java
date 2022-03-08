package com.example.wettermap;

public class Wind{
    public double speed;
    public int deg;
    public double gust;

    @Override
    public String toString() {
        return  " Windgeschwindigkeit: " + speed +"Km/h"+
                " Wind Temperatur: " + deg;
    }
}
