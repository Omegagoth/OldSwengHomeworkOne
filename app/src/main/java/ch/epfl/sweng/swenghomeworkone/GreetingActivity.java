package ch.epfl.sweng.swenghomeworkone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the greetings activity view as the activity layout
        setContentView(R.layout.activity_greeting);

        // Recuperation of the intent
        Intent intent = getIntent();
        String userName = intent.getStringExtra(MainActivity.EXTRA_USER_NAME);


        // Create the TextView
        TextView textView = (TextView) findViewById(R.id.greetingMessage);
        textView.setTextSize(40);
        textView.setText("Hello " + userName + "!");
    }
}
