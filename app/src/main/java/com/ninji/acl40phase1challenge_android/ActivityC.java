package com.ninji.acl40phase1challenge_android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.net.URI;

public class ActivityC extends AppCompatActivity {

    public static Intent newIntent (Context context){
        Intent intent = new Intent(context , ActivityC.class);
        return intent ;

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        TextView tv_email = findViewById(R.id.tv_email_value);
        TextView tv_number = findViewById(R.id.tv_number_value);
        TextView tv_slack = findViewById(R.id.tv_slack_value);


//        tv_email.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                // open the email app
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("message/rfc2822");
//                intent.putExtra(Intent.EXTRA_SUBJECT, R.string.greetings );
//                intent.putExtra(Intent.EXTRA_TEXT , R.string.email_body );
//                startActivity(intent);
//            }
//        });
//
//        tv_number.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                // open the phone's app
//                String number = "tel:" + tv_number.getText().toString() ;
//                Uri phoneNumber = Uri.parse(number);
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//
//            }
//        });
//
//        tv_slack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // open slack app
//            }
//        });
    }

}
