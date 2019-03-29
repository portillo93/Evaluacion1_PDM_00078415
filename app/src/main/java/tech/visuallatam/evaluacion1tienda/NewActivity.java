package tech.visuallatam.evaluacion1tienda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import tech.visuallatam.evaluacion1tienda.utils.AppConstants;


public class NewActivity extends AppCompatActivity {
    private Button bt1, bt2, bt3, bt4, bt5,bt6, bt7,bt8,bt9;
    private TextView mTuser,mTemail;
    private Button mBShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mTuser=findViewById(R.id.tv_user);
        mTemail=findViewById(R.id.tv_email);
        bt1 = findViewById(R.id.btn_pr1);
        bt2 = findViewById(R.id.btn_pr2);
        bt3 = findViewById(R.id.btn_pr3);
        bt4 = findViewById(R.id.btn_pr4);
        bt5 = findViewById(R.id.btn_pr5);
        bt6 = findViewById(R.id.btn_pr6);
        bt7 = findViewById(R.id.btn_pr7);
        bt8 = findViewById(R.id.btn_pr8);
        bt9 = findViewById(R.id.btn_pr9);
        mBShare=findViewById(R.id.btn_share);
        Intent mIntent = getIntent();
        mBShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent();
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.setType("text/plain");
                mIntent.putExtra(AppConstants.TEXT_KEY, bt1.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY1, bt2.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY2, bt3.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY3, bt4.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY4, bt5.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY5, bt6.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY6, bt7.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY7, bt8.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY8, bt9.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY9, mTemail.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_KEY10, mTuser.getText().toString());
                startActivity(mIntent);
            }
        });
        if(mIntent!=null){
            bt1.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
            bt2.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY1));
            bt3.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY2));
            bt4.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY3));
            bt5.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY4));
            bt6.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY5));
            bt7.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY6));
            bt8.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY7));
            bt9.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY8));
            mTemail.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY10));
            mTuser.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY9));



        }
    }
}
