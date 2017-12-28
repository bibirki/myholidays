/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDone extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutdone);
        TextView donetext = (TextView) findViewById(R.id.textdone);

        String cname2 = GlobalStrings.customname;
        donetext.setText(cname2);


        Button myButton1 = (Button) findViewById(R.id.my_button1);
        myButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Touchevent.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button myButton2 = (Button) findViewById(R.id.andere);

    }
}
