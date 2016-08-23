package com.kan.lannacookingv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView menuName, item,step, trick;
    private Cooking cooking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        cooking = (Cooking) intent.getSerializableExtra("cookingObj");

        menuName = (TextView) findViewById(R.id.title_menuName);
        item = (TextView)findViewById(R.id.item);
        step = (TextView)findViewById(R.id.step);
        trick = (TextView)findViewById(R.id.trick);
        ImageView pic = (ImageView)findViewById(R.id.img);


        menuName.setText(cooking.getName());
        pic.setImageResource(R.drawable.kkd);
        item.setText(cooking.getItem());
        step.setText(cooking.getStep());
        trick.setText(cooking.getTrick());


    }
}
