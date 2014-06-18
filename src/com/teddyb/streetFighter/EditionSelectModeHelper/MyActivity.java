package com.teddyb.streetFighter.EditionSelectModeHelper;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MyActivity extends Activity {



    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageButton BeowulfBtn = (ImageButton)findViewById(R.id.BeowulfBtn);


        BeowulfBtn.setOnClickListener(new OnClickListener() {

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
