package com.teddyb.FrameDataSkeleton;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.teddyb.FrameDataSkeleton.R;

public class MyActivity extends Activity {



    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageView BeowulfBtn = (ImageView)findViewById(R.id.BeowulfBtn);
        TextView BeowulfBtn2 = (TextView)findViewById(R.id.BeowulfBtn2);


        BeowulfBtn.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Beowulf.class);
                startActivity(intent);


            }
        });
        BeowulfBtn2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Beowulf.class);
                startActivity(intent);


            }
        });
}

    /*public void goKen(View v){
        Log.d("Test", "KenPushed");
    }
    public void goRyu(View v){
        Log.d("Test", "RyuPushed");
    }
    */
}
