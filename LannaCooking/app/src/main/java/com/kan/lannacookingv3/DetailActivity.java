package com.kan.lannacookingv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.ImageView;
=======
>>>>>>> e4d2c7e67c2a58d05fb010944f1a37a8ffd4cfcb
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView menuName, item,step, trick;
<<<<<<< HEAD
    private ImageView img;
=======
>>>>>>> e4d2c7e67c2a58d05fb010944f1a37a8ffd4cfcb
    private Cooking cooking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        cooking = (Cooking) intent.getSerializableExtra("cookingObj");

        menuName = (TextView) findViewById(R.id.menuName);
        item = (TextView)findViewById(R.id.item);
        step = (TextView)findViewById(R.id.step);
        trick = (TextView)findViewById(R.id.trick);

        menuName.setText(cooking.getName());
        item.setText(cooking.getItem());
        step.setText(cooking.getStep());
        trick.setText(cooking.getTrick());
<<<<<<< HEAD


=======
>>>>>>> e4d2c7e67c2a58d05fb010944f1a37a8ffd4cfcb
    }
}
