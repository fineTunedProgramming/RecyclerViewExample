package com.demo.frame.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleListViewActivity extends AppCompatActivity {

    private ImageView image;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_list_view);

        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);

        // getIntent from adapter and check for null for safety

        if (getIntent().getExtras() !=null){
            String nameContent = getIntent().getStringExtra("name");
            int imageContent = getIntent().getIntExtra("image",0);

            image.setImageDrawable(getResources().getDrawable(imageContent));
            name.setText(nameContent);
        }
    }
}
