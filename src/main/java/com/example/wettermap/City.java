package com.example.wettermap;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class City{
    public int id;
    public String name;
    public Coord coord;
    public String country;
    public int population;
    public int timezone;
    public int sunrise;
    public int sunset;

    @Override
    public String toString() {
        Date dateSunrise =new Date((long) sunrise*1000);
        Date dateSunset =new Date((long) sunset*1000);
        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm");
        return  name +
                " Bewohner:" + population + '\n' +
                "Land:" + country +
                " sunrise=" + sdf.format(dateSunrise) +
                " sunset=" + sdf.format(dateSunset);
    }
}