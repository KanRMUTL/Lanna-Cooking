package com.kan.lannacookingv3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Kanty on 20/8/2559.
 */
public class CookingAdapter extends BaseAdapter {
    private static Activity activity;
    private static LayoutInflater layoutInflater;
    private ArrayList<Cooking> cookings;
    public CookingAdapter(Activity activity, ArrayList<Cooking> cookings) {
        this.activity = activity;
        this.cookings = cookings;
        this.layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return cookings.size();
    }

    @Override
    public Cooking getItem(int position) {
        return this.cookings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Long.parseLong(this.cookings.get(position).getId());
    }

    @Override
    public View getView(int position, View converview, ViewGroup parent) {

        View view = converview;
        view = layoutInflater.inflate(R.layout.activity_row, null);
        ImageView img = (ImageView)view.findViewById(R.id.imageView) ;
        TextView menuName = (TextView)view.findViewById(R.id.menuName);
        TextView item = (TextView)view.findViewById(R.id.item);

        String path = this.cookings.get(position).getImg();

        try {
            InputStream ims = activity.getAssets().open(path);

            Drawable d = Drawable.createFromStream(ims, null);
            img.setImageDrawable(d);

            Log.e("OK", "IMG OKK");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        menuName.setText(this.cookings.get(position).getName());
        item.setText(this.cookings.get(position).getItem());
        return view;
    }
}
