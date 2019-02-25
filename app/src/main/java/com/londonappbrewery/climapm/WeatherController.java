package com.londonappbrewery.climapm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class WeatherController extends AppCompatActivity {

    // Constants:
    private final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather";
    // App ID to use OpenWeather data
    private final String APP_ID = "e72____PLEASE_REPLACE_ME_____13";
    private final long MIN_TIME = 5000; // Time btw location updates (5000 milliseconds or 5s)
    private final float MIN_DISTANCE = 1000; // Distance btw location updates (1000m or 1km)

    // TODO: Set LOCATION_PROVIDER here:



    // Member Variables:
    private TextView mCityLabel;
    private ImageView mWeatherImage;
    private TextView mTemperatureLabel;

    // TODO: Declare a LocationManager and a LocationListener here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_controller_layout);

        // Linking the elements in the layout to Java code
        mCityLabel = findViewById(R.id.locationTV);
        mWeatherImage = findViewById(R.id.weatherSymbolIV);
        mTemperatureLabel = findViewById(R.id.tempTV);
        ImageButton changeCityButton = findViewById(R.id.changeCityButton);



        // TODO: Add an OnClickListener to the changeCityButton here:

    }


    // TODO: Add onResume() here:



    // TODO: Add getWeatherForNewCity(String city) here:



    // TODO: Add getWeatherForCurrentLocation() here:



    // TODO: Add letsDoSomeNetworking(RequestParams params) here:



    // TODO: Add updateUI() here:



    // TODO: Add onPause() here:



}
