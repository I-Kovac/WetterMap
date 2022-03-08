package com.example.wettermap;

public class Weather{
    public int id;
    public String WeatherConditions;
    public String description;
    public String icon;

    @Override
    public String toString() {
        return " Wetterbedingungen:" + description;
    }
}