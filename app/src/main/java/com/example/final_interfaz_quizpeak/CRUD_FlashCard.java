package com.example.final_interfaz_quizpeak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CRUD_FlashCard extends AppCompatActivity {

    private Button save;
    EditText question;
    EditText answer;

    private Context mCont=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_r_u_d__flash_card);

        save = (Button) findViewById(R.id.fab);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mCont, CRUD_Mazo.class);
                startActivity(intent);
            }
        });

        question = (EditText) this.findViewById(R.id.ed_question);
        answer = (EditText) this.findViewById(R.id.ed_answer);
    }
}