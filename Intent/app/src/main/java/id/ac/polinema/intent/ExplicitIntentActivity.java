package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText input_nama;
    private TextView output_nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        input_nama=findViewById(R.id.input_name);
        output_nama=findViewById(R.id.text_output);
    }

    public void submitName(View view) {
        output_nama.setText(input_nama.getText().toString());
    }
}
