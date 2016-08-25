package com.kan.lannacookingv3;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Kanty on 25/8/2559.
 */
public class RowActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row);
        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "THSarabun Bold.ttf");
        TextView menuName = (TextView)findViewById(R.id.menuName);
        TextView item = (TextView)findViewById(R.id.item);

        menuName.setTypeface(mytypeface);
        item.setTypeface(mytypeface);
    }
}
