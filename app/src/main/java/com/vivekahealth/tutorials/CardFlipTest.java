package com.vivekahealth.tutorials;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.wajahatkarim3.easyflipview.EasyFlipView;

public class CardFlipTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_flip_test);


        final EasyFlipView easyFlipView = (EasyFlipView) findViewById(R.id.easyFlipView);
        easyFlipView.setFlipDuration(1000);
        easyFlipView.setFlipEnabled(true);





        findViewById(R.id.imgFrontCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CardFlipTest.this, "Front Card", Toast.LENGTH_SHORT).show();
                easyFlipView.flipTheView();
            }
        });

        findViewById(R.id.imgBackCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CardFlipTest.this, "Back Card", Toast.LENGTH_SHORT).show();
                easyFlipView.flipTheView();
            }
        });

        easyFlipView.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView easyView, EasyFlipView.FlipState newCurrentSide) {
                Toast.makeText(CardFlipTest.this,
                        "Flip Completed! New Side is: " + newCurrentSide, Toast.LENGTH_LONG).show();
            }
        });



        final EasyFlipView easyFlipView2 = (EasyFlipView) findViewById(R.id.easyFlipView2);
        easyFlipView2.setFlipDuration(1000);
        easyFlipView2.setFlipEnabled(true);

        findViewById(R.id.imgFrontCard2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CardFlipTest.this, "Front Card", Toast.LENGTH_SHORT).show();
                easyFlipView2.flipTheView();
            }
        });

        findViewById(R.id.imgBackCard2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CardFlipTest.this, "Back Card", Toast.LENGTH_SHORT).show();
                easyFlipView2.flipTheView();
            }
        });

        
    }
}
