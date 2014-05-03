package com.teddyb.streetFighter.EditionSelectModeHelper;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyActivity extends Activity {



    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button ryuBtn = (Button)findViewById(R.id.RyuBtn);

        ryuBtn.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ryu.class);
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
