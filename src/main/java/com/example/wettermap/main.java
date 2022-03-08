package com.example.wettermap;

import java.text.DecimalFormat;

public class main {
    public double temp;
    public double feels_like;
    public double temp_min;
    public double temp_max;
    public int pressure;
    public int sea_level;
    public int grnd_level;
        public int humidity;
    public double temp_kf;

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.##");
        return
                "Temp: " + df.format(temp-273.15)+" °C, " +
                "gefuehlt: " + df.format(feels_like-273.15)+" °C, " +
                "Luftfeuchtigkeit: " + humidity+"%";
    }
}
