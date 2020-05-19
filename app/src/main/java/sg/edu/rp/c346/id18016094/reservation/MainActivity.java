package sg.edu.rp.c346.id18016094.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    EditText etName, etNum, etSize;
    RadioGroup rg;
    RadioButton rb1, rb2;
    Button btnSubmit, btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        etName = findViewById(R.id.etName);
        etNum = findViewById(R.id.etNum);
        etSize = findViewById(R.id.etSize);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.radioButton1);
        rb2 = findViewById(R.id.radioButton2);
        btnSubmit = findViewById(R.id.buttonSubmit);
        btnReset = findViewById(R.id.buttonReset);
        tvDisplay = findViewById(R.id.tvDisplay);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "CONFIRMATION DETAILS" + "\n" + "Name: " + etName.getText() + "\n" + "Mobile No: "
                        + etNum.getText().toString() + "\n" + etSize.getText().toString()
                        + "\n" + "Date: " + dp.getDayOfMonth() + "/" + (dp.getMonth() + 1) + "/" + dp.getYear() +
                        "\n" + "Time: " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();
                tvDisplay.setText(message);
                
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(07);
                tp.setCurrentMinute(30);
                dp.updateDate(2020,06,01);
            }
        });
    }
}
