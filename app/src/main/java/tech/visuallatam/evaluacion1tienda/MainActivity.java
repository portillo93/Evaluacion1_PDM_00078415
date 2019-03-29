package tech.visuallatam.evaluacion1tienda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import tech.visuallatam.evaluacion1tienda.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    int pro1 = 0,pro2 = 0,pro3 = 0,pro4 = 0,pro5 = 0,pro6 = 0,pro7 = 0,pro8 = 0, pro9 = 0;
    private Button b1, b2, b3, b4, b5,b6, b7,b8,b9,mButton;
    private EditText eTextUser, eTextEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.btn_p1);
        b2 = findViewById(R.id.btn_p2);
        b3 = findViewById(R.id.btn_p3);
        b4 = findViewById(R.id.btn_p4);
        b5 = findViewById(R.id.btn_p5);
        b6 = findViewById(R.id.btn_p6);
        b7 = findViewById(R.id.btn_p7);
        b8 = findViewById(R.id.btn_p8);
        b9 = findViewById(R.id.btn_p9);
        mButton=findViewById(R.id.btn_send);
        eTextUser=findViewById(R.id.et_user);
        eTextEmail=findViewById(R.id.et_email);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro1++;
                b1.setText("Producto 1 "+ pro1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro2++;
                b2.setText("Producto 2 "+ pro2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro3++;
                b3.setText("Producto 3 "+ pro3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro4++;
                b4.setText("Producto 4 "+ pro4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro5++;
                b5.setText("Producto 5 "+ pro5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro6++;
                b6.setText("Producto 6 "+ pro6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro7++;
                b7.setText("Producto 7 "+ pro7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro8++;
                b8.setText("Producto 8 "+ pro8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro9++;
                b9.setText("Producto 9 "+ pro9);
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
                mIntent.putExtra(AppConstants.TEXT_KEY, "Producto 1 "+  pro1);
                mIntent.putExtra(AppConstants.TEXT_KEY1,"Producto 2 "+  pro2);
                mIntent.putExtra(AppConstants.TEXT_KEY2, "Producto 3 "+ pro3);
                mIntent.putExtra(AppConstants.TEXT_KEY3, "Producto 4 "+ pro4);
                mIntent.putExtra(AppConstants.TEXT_KEY4, "Producto 5 "+ pro5);
                mIntent.putExtra(AppConstants.TEXT_KEY5, "Producto 6 "+ pro6);
                mIntent.putExtra(AppConstants.TEXT_KEY6, "Producto 7 "+ pro7);
                mIntent.putExtra(AppConstants.TEXT_KEY7, "Producto 8 "+ pro8);
                mIntent.putExtra(AppConstants.TEXT_KEY8, "Producto 9 "+ pro9);
                mIntent.putExtra(AppConstants.TEXT_KEY9, "Usuario: "+eTextUser.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY10, "Email: "+eTextEmail.getText().toString());
                startActivity(mIntent);
            }
        });
    }
}
