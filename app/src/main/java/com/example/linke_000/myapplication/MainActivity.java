package com.example.linke_000.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// MainActivity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * A toast provides simple feedback about an operation in a small popup.
    * It only fills the amount of space required for the message and the current activity remains visible and interactive.
    * For example, navigating away from an email before you send it triggers a "Draft saved" toast to let you know that you can continue editing later.
    * Toasts automatically disappear after a timeout.
    * */
    public void do_something(View view) {
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
        Log.d("TAG_", "doSomething: ");
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);
    }

    public void clickButton1(View view) {
        Toast.makeText(this, "You clicked button1", Toast.LENGTH_SHORT).show();
        Log.i("TAG_", "clicked button1");
        TextView textView = (TextView) findViewById(R.id.a_main_txt);
        textView.setText("" + 1);
    }

    public void clickButton2(View view) {
        Toast.makeText(this, "You clicked button2", Toast.LENGTH_SHORT).show();
        Log.e("TAG_", "clicked button2");
        TextView textView = (TextView) findViewById(R.id.a_mai0n_txt);
        textView.setText("" + 2);
    }

    public void sum(View view) {
        TextView textViewA = (TextView) findViewById(R.id.a_main_edit_txt1);
        int a = Integer.parseInt("" + textViewA.getText());
        TextView textViewB = (TextView) findViewById(R.id.a_main_edit_txt2);
        int b = Integer.parseInt("" + textViewB.getText());
        int c = a + b;
        TextView textViewAnswer = (TextView) findViewById(R.id.a_answer_txt);
        textViewAnswer.setText("" + c);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
            TextView textViewAnswer = (TextView) findViewById(R.id.a_answer_txt);
            textViewAnswer.setText("landscape");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
            TextView textViewAnswer = (TextView) findViewById(R.id.a_answer_txt);
            textViewAnswer.setText("portrait");
        }
    }

}
