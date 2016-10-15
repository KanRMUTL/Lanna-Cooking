package com.kan.lannacookingv3;

import android.content.Intent;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class DetailActivity extends AppCompatActivity {
    private TextView menuName, item,step, trick,information;
    private Cooking cooking ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "THSarabun Bold.ttf");

        Intent intent = getIntent();

        cooking = (Cooking) intent.getSerializableExtra("cookingObj");

        menuName = (TextView)findViewById(R.id.title_menuName);
        information = (TextView)findViewById(R.id.information);
        item = (TextView)findViewById(R.id.item);
        step = (TextView)findViewById(R.id.step);
        trick = (TextView)findViewById(R.id.trick);
        ImageView img = (ImageView)findViewById(R.id.img);


        String path = this.cooking.getImg();
        try {
            InputStream ims = getAssets().open(path);

            Drawable d = Drawable.createFromStream(ims, null);
            img.setImageDrawable(d);
            Log.e("Img OK", "Image Detail OK!!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        menuName.setText(cooking.getName());
        information.setText(cooking.getInformation());
        item.setText(cooking.getItem());
        step.setText(cooking.getStep());
        trick.setText(cooking.getTrick());

        menuName.setTypeface(mytypeface);
        information.setTypeface(mytypeface);
        item.setTypeface(mytypeface);
        step.setTypeface(mytypeface);
        trick.setTypeface(mytypeface);

    }
}
