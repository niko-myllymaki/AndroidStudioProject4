package nm.vamk.assignment_4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button displayButton = (Button) findViewById(R.id.button_display);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextViewValue(getCurrenDateTime());
            }
        });


    }

    public void clearTextView(View view) {
        TextView textViewDateTime = findViewById(R.id.tw_date_time);
        textViewDateTime.setText("");
    }

    public void setTextViewValue(String value) {
        TextView textViewDateTime = findViewById(R.id.tw_date_time);
        textViewDateTime.setText(value);
    }

    public String getCurrenDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);


    }

}