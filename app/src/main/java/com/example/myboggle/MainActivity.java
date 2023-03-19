package com.example.myboggle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

   String[] Display_Angle,Top_1;
    String Angle,Tile;
    ImageView imageview;
    int[] Sel_Image;//array of int
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview=findViewById(R.id.Second_Cube);
        //Display_Angle=R.getStringArray(R.array.Display_Angle);
    }

public void Start(View view)

    {
        Resources r =getResources(); //allows arrays to be loaded
        TypedArray Tiles = getResources().obtainTypedArray(R.array.image_array); //get array with tiles in
        Random rand = new Random();
        int randomNum4= rand.nextInt(3-0+1); //creates random angle for displayed letter
        int randomNum6= rand.nextInt(6-0+1); //creates random angle for displayed letter
Top_1=r.getStringArray(R.array.Display_Angle);
Angle=Top_1[randomNum4]; //chooses from 4 options
float tempFloat = Float.parseFloat(Angle);
//Sel_Image=r.getIntArray(R.array.i); //get image filename from the array
//Tile=Sel_Image[randomNum6] ; //chooses from 6 options
       // Tile="R.drawable.a1";
      //  int int1 = Integer.valueOf(Tile.getText().toString());
int choice = (int)(Math.random()*Tiles.length());
imageview.setImageResource(Tiles.getResourceId(choice,R.drawable.a1));
imageview.setRotation(tempFloat);

    }
public void Stop(View view){
        System.exit(0);
}
}