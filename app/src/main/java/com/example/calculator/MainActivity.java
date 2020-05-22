package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editfirstval,editsecondval;
    TextView answer;
    Button btnadd,btnsub,btnmul,btndiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editfirstval=findViewById(R.id.edfirstno);
        editsecondval=findViewById(R.id.editsecondno);
        btnadd=findViewById(R.id.btnadd);
        btndiv=findViewById(R.id.btndiv);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        answer=findViewById(R.id.textView);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(editfirstval.getText().toString());
                secondvalue=Integer.parseInt(editsecondval.getText().toString());
                ans=firstvalue+secondvalue;
                answer.setText("="+ans);
                Toast.makeText(MainActivity.this,ans+"",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("data",ans+"");
                startActivity(intent);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(editfirstval.getText().toString());
                secondvalue=Integer.parseInt(editsecondval.getText().toString());
                ans=firstvalue-secondvalue;
                answer.setText("="+ans);
                Toast toast=Toast.makeText(MainActivity.this,ans+"",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(editfirstval.getText().toString());
                secondvalue=Integer.parseInt(editsecondval.getText().toString());
                ans=firstvalue*secondvalue;
                answer.setText("="+ans);
                Toast toast=Toast.makeText(MainActivity.this,ans+"",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);
                toast.show();
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(editfirstval.getText().toString());
                secondvalue=Integer.parseInt(editsecondval.getText().toString());
                ans=firstvalue/secondvalue;
                answer.setText("="+ans);
                Toast toast=Toast.makeText(MainActivity.this,ans+"",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,10,0);
                toast.show();
            }
        });
    }
}
