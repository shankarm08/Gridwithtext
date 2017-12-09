package com.wedddingapp.shankar.gryytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.GridView;
/**
 *

 *
 */

public class MainActivity extends Activity {
    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set grid view item
        Bitmap gingerIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.gingerbread);
        Bitmap honeyIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.honeycomb);
        Bitmap icecreamIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.icecream);
        Bitmap jellybeanIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.jellybeann);
        Bitmap kitkatIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.kitkatn);
        Bitmap lollipopIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.lollipop);
       // Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);

        gridArray.add(new Item(gingerIcon,"gingerbread"));
        gridArray.add(new Item(honeyIcon,"honeycomb"));
        gridArray.add(new Item(icecreamIcon,"icecream"));
        gridArray.add(new Item(jellybeanIcon,"jellybean"));
        gridArray.add(new Item(kitkatIcon,"kitkat"));
        gridArray.add(new Item(lollipopIcon,"lolipop"));


        gridView = (GridView) findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
    }

}