package com.saija.android.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class BeerAdviser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_adviser);
    }

    public void onClickFindBeer(View view) {
        BeerExpert bExpert = new BeerExpert();

        Random aleatorio = new Random();
        TextView brands = (TextView)findViewById(R.id.brands);
        Spinner colors = (Spinner)findViewById(R.id.color);
        String beerType = String.valueOf(colors.getSelectedItem());

        brands.setBackgroundColor(aleatorio.nextInt());


        List<String> brands1 = bExpert.getBrands(beerType);
        StringBuilder brandsBuilder = new StringBuilder();
        for(String brand : brands1){
            brandsBuilder.append(brand).append("\n");
        }
        brands.setText(brandsBuilder);

    }
}
