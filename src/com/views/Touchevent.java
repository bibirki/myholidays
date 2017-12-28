/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.views;

/**
 *
 * @author FK08
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import android.widget.LinearLayout;
import android.widget.Toast;

public class Touchevent extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wischlayout);



        Context context = getApplicationContext();

// hier eine ID für Ihr in der xml layout vergeben
        LinearLayout v = (LinearLayout) findViewById(R.id.wischView);
        v.setOnTouchListener(new OnSwipeTouchListener(context) {
            //Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_SHORT;
            Context context = getApplicationContext();
            Toast toast;
            @Override
            public void onSwipeLeft() {
                text = "left";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            @Override
            public void onSwipeRight() {
                text="right";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            public void onSwipeUp() {
                text="up";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            public void onSwipeDown() {
                text="down";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            
        });



    }
}
/* public boolean onTouch(View v, MotionEvent event) {

Context context = getApplicationContext();
int duration = Toast.LENGTH_SHORT;
CharSequence text;

switch (event.getActionMasked()) {
case MotionEvent.ACTION_DOWN:
text = "Hello Ich bin ein Touch up Event!";
break;
default:
text = "Hello Ich bin noch nicht implementiert!";
break;
}

Toast toast = Toast.makeText(context, text, duration);
toast.show();

return false;
}
} */