package com.example.wettermap;

import java.util.ArrayList;

public class Root{
    public String cod;
    public int message;
    public int cnt;
    public ArrayList<List> list;
    public City city;

    @Override
    public String toString() {
        return  "city:" + city + '\n' +
                list +
                ", cod=" + cod;
    }
}