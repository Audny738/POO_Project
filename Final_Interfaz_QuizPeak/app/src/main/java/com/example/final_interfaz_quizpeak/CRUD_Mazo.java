package com.example.final_interfaz_quizpeak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CRUD_Mazo extends AppCompatActivity {

    private Button add;
    private Button save_mazo;

    private Context mCont=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_r_u_d__flash_card);

        add = (Button) findViewById(R.id.add_flash);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mCont, CRUD_FlashCard.class);
                startActivity(intent);
            }
        });

        save_mazo = (Button) findViewById(R.id.save_mazo);
        //save_mazo.setOnClickListener();
    }
}