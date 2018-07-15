package com.example.amirabbas.testview;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


      ImageButton BtnBack=(ImageButton) findViewById(R.id.Back_Button);
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button BtnEdit=(Button)findViewById(R.id.Edit_profile);
        BtnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this,"ویرایش عکس کلیک شد",Toast.LENGTH_LONG).show();




            }
        });

        Typeface typeface=Typeface.createFromAsset(getAssets(),"font/B_Yekan.ttf");

        EditText NameEditText=(EditText)findViewById(R.id.Edit_text_Firstname);

        NameEditText.setTypeface(typeface);
        EditText FamilyEditText=(EditText)findViewById(R.id.Edit_text_Lastname);
        FamilyEditText.setTypeface(typeface);

        NameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
