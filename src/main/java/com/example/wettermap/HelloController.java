package com.example.wettermap;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HelloController {
//    public Label MonDate;
//    public Label MonDay;
//    public Label MonWeather;
//    public Label MonTemp;
//
//    public Label TueDate;
//    public Label TueDay;
//    public Label TueWeather;
//    public Label TueTemp;
//
//    public Label WedDate;
//    public Label WedDay;
//    public Label WedWeather;
//    public Label WedTemp;
//
//    public Label ThuDate;
//    public Label ThuDay;
//    public Label ThuWeather;
//    public Label ThuTemp;
//
//    public Label FrDate;
//    public Label FrDay;
//    public Label FrWeather;
//    public Label FrTemp;
    @FXML
    private Label welcomeText;
    @FXML
    protected TextField city;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void Abfrage(){
        String chosenCity=city.getText();
        try {                       // Connection zur API

            URL url = new URL("http://api.openweathermap.org/data/2.5/forecast?q="+chosenCity+"&appid=d134cb284ef6ebbab66ea57a6b83f4f8");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            Scanner s = new Scanner(con.getInputStream());
            // Zum einlesen von dem Server bereitgestellten String
            StringBuilder reader = new StringBuilder();
            while (s.hasNextLine()){
                reader.append(s.nextLine());
            }
            // Erstellen einer Pojo klasse vom Server gegebenen String
            Gson gson = new Gson();
            Root wetter = (gson.fromJson(String.valueOf(reader), Root.class));


        }
        catch  (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}