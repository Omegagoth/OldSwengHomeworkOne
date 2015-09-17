package ch.epfl.sweng.swenghomeworkone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_USER_NAME = "ch.epfl.sweng.swenghomeworkone.USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the go button */
    public void goGreetings(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        EditText tempText = (EditText) findViewById(R.id.mainName);

        String userName = tempText.getText().toString();
        intent.putExtra(EXTRA_USER_NAME, userName);

        startActivity(intent);
    }
}
