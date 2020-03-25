
 package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cookies.R;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    /**

     * Called when the cookie should be eaten.

     */

    public void eatCookie(View view) {

        // TODO: Find a reference to the ImageView in the layout. Change the image.

        ImageView afterCookie =  findViewById(R.id.android_cookie_image_view);
afterCookie.setImageResource(R.drawable.after_cookie);
        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView hungryTextView = findViewById(R.id.status_text_view);
        hungryTextView.setText("I'm so full");


    }


}



