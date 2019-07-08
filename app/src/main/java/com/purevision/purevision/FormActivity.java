package com.purevision.purevision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.purevision.purevision.MainActivity;

import java.util.ArrayList;

public class FormActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    ArrayList<String> cam_url = MainActivity.cam_url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);

        editText = findViewById(R.id.editText);
        String str = editText.getText().toString();

        if(str != null)
            cam_url.add(str);

        startActivity(intent);
    }
}
