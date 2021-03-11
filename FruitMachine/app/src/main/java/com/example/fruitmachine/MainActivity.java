package com.example.fruitmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    TextView credit;
    TextView winning;
    int credits = 0;
    int winnings = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        winning = findViewById(R.id.winning);
    }
    public void onClickAddCredit(View v)
    {
        credit = findViewById(R.id.credit);
        credits = credits+5;
        credit.setText(Integer.toString(credits));

    }
    public void onClickSpin(View v)
    {
        if(credits >= 5)
        {
            int[] images = {R.drawable.apple,R.drawable.banana,R.drawable.cherries,R.drawable.grapes,R.drawable.lemon,R.drawable.melon,R.drawable.orange};
            Random rand = new Random();
            imageView1.setImageResource(images[rand.nextInt(images.length)]);
            imageView2.setImageResource(images[rand.nextInt(images.length)]);
            imageView3.setImageResource(images[rand.nextInt(images.length)]);

            credits = credits - 5;
            credit.setText(Integer.toString(credits));
            if (imageView1.getDrawable().getConstantState() == imageView2.getDrawable().getConstantState() && imageView2.getDrawable().getConstantState() == imageView3.getDrawable().getConstantState())
            {
                winnings = winnings + 10;
                winning.setText(Integer.toString(winnings));
                Toast.makeText(this, "Congratulations! you've won 10 points", Toast.LENGTH_SHORT).show();
            }
            else if (imageView2.getDrawable().getConstantState() == imageView3.getDrawable().getConstantState())
            {
                winnings = winnings + 5;
                winning.setText(Integer.toString(winnings));
                Toast.makeText(this, "Congratulations! you've won 5 points", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Bad luck:( Try Again!", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(this, "No Credit! Add Credit To Spin", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickCollect(View v)
    {
        if (winnings >= 5)
        {
            Toast.makeText(this, "You have collected "+winnings+" Winnings", Toast.LENGTH_SHORT).show();
            winnings = 0;
            winning.setText(Integer.toString(winnings));
        }
        else
        {
            Toast.makeText(this, "Spin to Win!", Toast.LENGTH_SHORT).show();
        }

    }
}