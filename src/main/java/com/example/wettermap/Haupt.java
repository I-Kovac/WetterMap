package com.example.wettermap;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Haupt {
    public static void main(String[] args)  {
        try {                       // Connection zur API
            URL url = new URL("http://api.openweathermap.org/data/2.5/forecast?q=Steyr,at&appid=d134cb284ef6ebbab66ea57a6b83f4f8");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            Scanner s = new Scanner(con.getInputStream());
                                    // Zum einlesen von dem Server bereitgestellten String
            StringBuilder reader = new StringBuilder();
            while (s.hasNextLine()){
                reader.append(s.nextLine());
            }
                                    // Erstellen einer Pojo klasse vom Server gegebenen String
            Gson gson = new Gson();
            System.out.println(gson.fromJson(String.valueOf(reader), Root.class));



        }
        catch  (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
