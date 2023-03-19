package com.example.myboggle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

   String[] Display_Angle,Top_1,Sel_Letter;
    String Angle,Tile,Tube_Array_Choice;
    //ImageView imageview;
    Integer Cube_Number,Tube_Array_Choice_Int;
    TextView text_13,text_1,text_2;
    int[] Sel_Cube;//array of int
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // imageview=findViewById(R.id.Second_Cube);
        text_1=findViewById(R.id.Cube_1);
        text_2=findViewById(R.id.Cube_2);
        text_13=findViewById(R.id.Cube_13);
        //Display_Angle=R.getStringArray(R.array.Display_Angle);
    }

public void Start(View view) {
    Resources r = getResources(); //allows arrays to be loaded
    TypedArray Tiles = getResources().obtainTypedArray(R.array.image_array); //get array with tiles in
    Random rand = new Random();
    int randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    int randomNum6 = rand.nextInt(5 ); //creates random angle for displayed letter
    Top_1 = r.getStringArray(R.array.Display_Angle);
    Angle = Top_1[randomNum4]; //chooses from 4 options
    float tempFloat = Float.parseFloat(Angle);
//Sel_Image=r.getIntArray(R.array.i); //get image filename from the array
//Tile=Sel_Image[randomNum6] ; //chooses from 6 options
    // Tile="R.drawable.a1";
    //  int int1 = Integer.valueOf(Tile.getText().toString());

   // Sel_Letter = r.getStringArray(R.array.nineth_cube); //get image filename from the array
   // int choice = (int) (Math.random() * Tiles.length());
  //  imageview.setImageResource(Tiles.getResourceId(choice, R.drawable.a1));
  //  imageview.setRotation(tempFloat);

//text_13.setText(" C");
   // Tile = Sel_Letter[randomNum6];
  //  text_13.setText(Tile);
  //  text_13.setRotation(tempFloat);
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 16; i++) list.add(i);
    Collections.shuffle(list);
    Cube_Number = list.get(0); //extract number for first cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    int arrayName_ID= getResources().getIdentifier(Tube_Array_Choice , "array",this.getPackageName());

    String[] items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
   // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_1.setText(Tile);
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_1.setRotation(tempFloat);

    //next cube along from top left

    Cube_Number = list.get(1); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
     arrayName_ID= getResources().getIdentifier(Tube_Array_Choice , "array",this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_2.setText(Tile);
     randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_2.setRotation(tempFloat);


   
    }
public void Stop(View view){
        System.exit(0);
}
}