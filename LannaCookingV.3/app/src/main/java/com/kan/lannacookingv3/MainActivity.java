package com.kan.lannacookingv3;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "THSarabun Bold.ttf");

        listView = (ListView)findViewById(R.id.listView);

        TextView title = (TextView)findViewById(R.id.title);
        title.setTypeface(mytypeface);

        CookingDAO cookingDAO = new CookingDAO(this);
        final CookingAdapter adapter = new CookingAdapter(this, cookingDAO.findAll());
        listView.setAdapter(adapter);
        cookingDAO.close();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent e = new Intent(MainActivity.this, DetailActivity.class);
                e.putExtra("cookingObj", adapter.getItem(position));
                startActivity(e);
            }
        });

    }
}
