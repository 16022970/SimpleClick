package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

//new line
public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = (TextView)findViewById(R.id.textViewDisplay);
        btnDisplay = (Button)findViewById(R.id.buttonDisplay);
        etInput = (EditText)findViewById(R.id.EditTextInput);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        tbtn =(ToggleButton) findViewById(R.id.toggleButton);
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tbtn.isChecked()){
                    etInput.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);
                }
            }
        });



    }
}
