package com.example.flagtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Random;

public class play extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        imageView = findViewById(R.id.imageView);
        int[] images = {R.drawable.au,R.drawable.br,R.drawable.ca,R.drawable.fr,R.drawable.gb,R.drawable.ir,R.drawable.it};
        Random rand = new Random();
        imageView.setImageResource(images[rand.nextInt(images.length)]);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.playagain:
                openActivity2();
                return true;
            case R.id.exit:
                finish();
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void openActivity2() {
        Intent intent = new Intent(this, play.class);
        startActivity(intent);
    }
    public void onClickButton(View v)
    {
        radioGroup = findViewById(R.id.radioGroup);
        int radioId =radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        switch (radioId) {
            case R.id.choice1:
                if(imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.au).getConstantState())
                {
                    Intent intent = new Intent(this, win.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"You are correct!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(this, lose.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"Wrong, try again",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.choice2:
                if(imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.br).getConstantState())
                {
                    Intent intent = new Intent(this, win.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"You are correct!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(this, lose.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"Wrong, try again",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.choice3:
                if(imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ca).getConstantState())
                {
                    Intent intent = new Intent(this, win.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"You are correct!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(this, lose.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"Wrong, try again",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.choice4:
                if(imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.fr).getConstantState())
                {
                    Intent intent = new Intent(this, win.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"You are correct!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(this, lose.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"Wrong, try again",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.choice5:
                if(imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.gb).getConstantState())
                {
                    Intent intent = new Intent(this, win.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"You are correct!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(this, lose.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"Wrong, try again",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.choice6:
                if(imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ir).getConstantState())
                {
                    Intent intent = new Intent(this, win.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"You are correct!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(this, lose.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"Wrong, try again",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.choice7:
                if(imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.it).getConstantState())
                {
                    Intent intent = new Intent(this, win.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"You are correct!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(this, lose.class);
                    startActivity(intent);
                    //Toast.makeText(getApplicationContext(),"Wrong, try again",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}