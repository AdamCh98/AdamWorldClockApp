package com.example.worldclockadam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring constraints and the relevant items
    public ConstraintLayout sydney;
    public ConstraintLayout auckland;
    public ConstraintLayout london;
    public ConstraintLayout newyork;
    public ConstraintLayout shanghai;
    public ConstraintLayout tokyo;
    public ConstraintLayout zurich;
    public LinearLayout buttonLayout;

    //Texts & images
    public TextView cityName;
    public ImageView cityPhoto;
    public Button twelveHrButton;
    public Button twentyHrButton;
    public Button hideButton;


    //Clock
    public TextClock clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Displaying the appropriate cities - Name and images

        //Sydney

        sydney = findViewById(R.id.sydneyLayout);
        cityName = sydney.findViewById(R.id.cityName1);
        cityName.setText("Sydney");
        cityPhoto = sydney.findViewById(R.id.imageView);
        cityPhoto.setImageResource(R.drawable.sydney);
        clock= sydney.findViewById(R.id.cityTime);
        clock.setTimeZone("Australia/Sydney");

        //Auckland

        auckland = findViewById(R.id.aucklandLayout);
        cityName = auckland.findViewById(R.id.cityName1);
        cityName.setText("Auckland");
        cityPhoto = auckland.findViewById(R.id.imageView);
        cityPhoto.setImageResource(R.drawable.auckland);
        clock= auckland.findViewById(R.id.cityTime);
        clock.setTimeZone("Pacific/Auckland");

        //London

        london = findViewById(R.id.londonLayout);
        cityName = london.findViewById(R.id.cityName1);
        cityName.setText("London");
        cityPhoto = london.findViewById(R.id.imageView);
        cityPhoto.setImageResource(R.drawable.london);
        clock= london.findViewById(R.id.cityTime);
        clock.setTimeZone("Europe/London");

        //newyork

        newyork = findViewById(R.id.newyorkLayout);
        cityName = newyork.findViewById(R.id.cityName1);
        cityName.setText("New York");
        cityPhoto = newyork.findViewById(R.id.imageView);
        cityPhoto.setImageResource(R.drawable.newyork);
        clock= newyork.findViewById(R.id.cityTime);
        clock.setTimeZone("America/New_York");

        //shanghai

        shanghai = findViewById(R.id.shanghaiLayout);
        cityName = shanghai.findViewById(R.id.cityName1);
        cityName.setText("Shanghai");
        cityPhoto = shanghai.findViewById(R.id.imageView);
        cityPhoto.setImageResource(R.drawable.shanghai);
        clock = shanghai.findViewById(R.id.cityTime);
        clock.setTimeZone("Asia/Shanghai");

        //Tokyo

        tokyo = findViewById(R.id.tokyoLayout);
        cityName = tokyo.findViewById(R.id.cityName1);
        cityName.setText("Tokyo");
        cityPhoto = tokyo.findViewById(R.id.imageView);
        cityPhoto.setImageResource(R.drawable.tokyo);
        clock= tokyo.findViewById(R.id.cityTime);
        clock.setTimeZone("Asia/Tokyo");

        //Zurich

        zurich = findViewById(R.id.zurichLayout);
        cityName = zurich.findViewById(R.id.cityName1);
        cityName.setText("Zurich");
        cityPhoto = zurich.findViewById(R.id.imageView);
        cityPhoto.setImageResource(R.drawable.zurich);
        clock= zurich.findViewById(R.id.cityTime);
        clock.setTimeZone("Europe/Zurich");



        //Button changes
        twelveHrButton = findViewById(R.id.twelveButton);
        twentyHrButton = findViewById(R.id.twentyFourButton);

        twelveHrButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View views) {
                //change the clock to 12hr time
                clock = sydney.findViewById(R.id.cityTime);
                clock.setFormat12Hour("h:mm:ss a");

                clock = auckland.findViewById(R.id.cityTime);
                clock.setFormat12Hour("h:mm:ss a");

                clock = london.findViewById(R.id.cityTime);
                clock.setFormat12Hour("h:mm:ss a");

                clock = newyork.findViewById(R.id.cityTime);
                clock.setFormat12Hour("h:mm:ss a");

                clock = shanghai.findViewById(R.id.cityTime);
                clock.setFormat12Hour("h:mm:ss a");

                clock = tokyo.findViewById(R.id.cityTime);
                clock.setFormat12Hour("h:mm:ss a");

                clock = zurich.findViewById(R.id.cityTime);
                clock.setFormat12Hour("h:mm:ss a");

            }

        });


        twentyHrButton.setOnClickListener(new View.OnClickListener() {

            //Change the clock to 24hr time
            public void onClick(View v) {
                clock = sydney.findViewById(R.id.cityTime);
                clock.setFormat12Hour("HH:mm:ss");

                clock = auckland.findViewById(R.id.cityTime);
                clock.setFormat12Hour("HH:mm:ss");

                clock = london.findViewById(R.id.cityTime);
                clock.setFormat12Hour("HH:mm:ss");

                clock = newyork.findViewById(R.id.cityTime);
                clock.setFormat12Hour("HH:mm:ss");

                clock = shanghai.findViewById(R.id.cityTime);
                clock.setFormat12Hour("HH:mm:ss");

                clock = tokyo.findViewById(R.id.cityTime);
                clock.setFormat12Hour("HH:mm:ss");

                clock = zurich.findViewById(R.id.cityTime);
                clock.setFormat12Hour("HH:mm:ss");
            }


        });





    }
}
