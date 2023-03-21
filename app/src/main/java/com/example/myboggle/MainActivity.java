package com.example.myboggle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    float tempFloat;

    String[] Display_Angle,Top_1,Sel_Letter,items;
    String Angle,Tile,Tube_Array_Choice;
    ArrayList<Integer> list;
    //ImageView imageview;
    Integer Cube_Number,Tube_Array_Choice_Int,j,arrayName_ID;
    TextView text_13,text_1,text_2,text_3,text_4,text_5,text_6,text_7,text_8,text_9,text_10,text_11,text_12,text_14,text_15,text_16,mTextField;
    int[] Sel_Cube;//array of int
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // imageview=findViewById(R.id.Second_Cube);
        mTextField=findViewById(R.id.mTextField);
        text_1=findViewById(R.id.Cube_1);
        text_2=findViewById(R.id.Cube_2);
        text_3=findViewById(R.id.Cube_3);
        text_4=findViewById(R.id.Cube_4);
        text_5=findViewById(R.id.Cube_5);
        text_6=findViewById(R.id.Cube_6);
        text_7=findViewById(R.id.Cube_7);
        text_8=findViewById(R.id.Cube_8);
        text_9=findViewById(R.id.Cube_9);
        text_10=findViewById(R.id.Cube_10);
        text_11=findViewById(R.id.Cube_11);
        text_12=findViewById(R.id.Cube_12);
        text_13=findViewById(R.id.Cube_13);
        text_14=findViewById(R.id.Cube_14);
        text_15=findViewById(R.id.Cube_15);
        text_16=findViewById(R.id.Cube_16);
        //Display_Angle=R.getStringArray(R.array.Display_Angle);
    }

public void Start(View view) {

    Resources r = getResources(); //allows arrays to be loaded



    TypedArray Tiles = getResources().obtainTypedArray(R.array.image_array); //get array with tiles in
    Random rand = new Random();
    int randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    int randomNum6 = rand.nextInt(5); //creates random angle for displayed letter
    Top_1 = r.getStringArray(R.array.Display_Angle);
    Angle = Top_1[randomNum4]; //chooses from 4 options
     tempFloat = Float.parseFloat(Angle);
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
     list = new ArrayList<Integer>();
    for (int i = 0; i < 16; i++) list.add(i);
    Collections.shuffle(list); //randomizes the 16 numbers in the list
    Cube_Number = list.get(0); //extract number for first cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
     arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());//gets ID of the array chosen

    items = getResources().getStringArray(arrayName_ID);

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
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_2.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_2.setRotation(tempFloat);

//next cube along from top left

    Cube_Number = list.get(2); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_3.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_3.setRotation(tempFloat);

    //next cube along from top left

    Cube_Number = list.get(3); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_4.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_4.setRotation(tempFloat);

    //next cube along from top left

    Cube_Number = list.get(4); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_5.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_5.setRotation(tempFloat);


    Cube_Number = list.get(5); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_6.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_6.setRotation(tempFloat);

    Cube_Number = list.get(6); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_7.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_7.setRotation(tempFloat);

    Cube_Number = list.get(7); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_8.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_8.setRotation(tempFloat);

    Cube_Number = list.get(8); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_9.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_9.setRotation(tempFloat);

    Cube_Number = list.get(9); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_10.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_10.setRotation(tempFloat);

    Cube_Number = list.get(10); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_11.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_11.setRotation(tempFloat);

    Cube_Number = list.get(11); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_12.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_12.setRotation(tempFloat);

    Cube_Number = list.get(12); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_13.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_13.setRotation(tempFloat);

    Cube_Number = list.get(13); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_14.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_14.setRotation(tempFloat);

    Cube_Number = list.get(14); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];
    text_15.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_15.setRotation(tempFloat);

    Cube_Number = list.get(15); //extract number for next cube position (top left)
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Tile = items[randomNum6];

    text_16.setText(Tile);
    randomNum4 = rand.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_16.setRotation(tempFloat);




    new CountDownTimer(30000, 1000) {

        public void onTick(long millisUntilFinished) {
            mTextField.setText( millisUntilFinished / 1000+" seconds remaining: ");
        }

        public void onFinish() {
            mTextField.setText("Done!");
        }
    }.start();
    }

public String myMethod(int Selected_Array, int j){
    Resources r = getResources(); //allows arrays to be loaded
    list = new ArrayList<Integer>();
    for (int i = 0; i < 16; i++) list.add(i);
    Collections.shuffle(list); //randomizes the 16 numbers in the list


    Cube_Number = list.get(j); //extract number for next cube position (top left)//j is number to iterate through all 16 cubes
    //if (Cube_Number==1){
    Sel_Letter = r.getStringArray(R.array.cube_arrays);
    Tube_Array_Choice = Sel_Letter[Cube_Number];
    arrayName_ID = getResources().getIdentifier(Tube_Array_Choice, "array", this.getPackageName());

    items = getResources().getStringArray(arrayName_ID);

    // Tube_Array_Choice_Int=Integer.valueOf(Tube_Array_Choice.getText()toString));
    // Sel_Letter = r.getStringArray(Tube_Array_Choice_Int);
    Random rand1 = new Random();
    int randomNum6 = rand1.nextInt(5); //creates random angle for displayed letter
    Tile = items[randomNum6];
    text_16.setText(Tile);
    int randomNum4 = rand1.nextInt(3 - 0 + 1); //creates random angle for displayed letter
    Top_1 = r.getStringArray(R.array.Display_Angle);
    Angle = Top_1[randomNum4]; //chooses from 4 options
    tempFloat = Float.parseFloat(Angle);
    text_16.setRotation(tempFloat);
return Tile;
}


    public void onPress() {


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override


            public void run() {


                    myMethod(5, 5);
            }
        }, 2000);
}

        public void Stop (View view){
            System.exit(0);
        }
public void Looper(View view){

    Timer timer = new Timer();
    int begin = 0;
    int timeInterval = 100;
    timer.schedule(new TimerTask() {
        int counter = 0;
        @Override
        public void run() {
            myMethod(5, 5);;
            counter++;
            if (counter >= 20){
                timer.cancel();
            }
        }
    }, begin, timeInterval);


}
}

