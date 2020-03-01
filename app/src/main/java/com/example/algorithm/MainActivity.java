package com.example.algorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import static com.example.algorithm.Answer.shortestSubstring;

public class MainActivity extends AppCompatActivity {
    int error=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Test("bcaacbc");

    }




    public void Test(String input){

        int stringLenght = input.length();
        for(int i = 0;i<stringLenght;i++)
        {
            char res = input.charAt(i);
            if(Character.isDigit(res))
            {
                error =1;
            }

        }
        if(error == 0)
        {
            int subStringLength = shortestSubstring(input);
            Log.i("firat", "length : " + subStringLength);
        }
        else
        {
            Log.i("firat", "Girdiğiniz dizide rakamlar var!");
        }

    }


}
