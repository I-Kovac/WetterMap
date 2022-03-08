package com.example.wettermap;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class List{
    public int dt;
    public main main;
    public ArrayList<Weather> weather;
    public Clouds clouds;
    public Wind wind;
    public int visibility;
    public double pop;
    public Sys sys;
    public String dt_txt;
    public Snow snow;

    @Override
    public String toString() {
        Date date =new Date((long) dt*1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:kk:mm");
String   ret=  dt_txt+"|" +
                main +"|"+
                weather +
                wind +
                ", Sichtweite: " + visibility +"Km";

            if (snow != null){
                ret+=" Schnefall!";
            }
            ret+="\n";

        return ret;
    }
}