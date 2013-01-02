package com.kevinhorek.crystalball;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Declare our View variables and assign them the Views from the layout file
        final TextView answerLabel = (TextView) findViewById(R.id.textView1);
        Button getAnswerButton = (Button) findViewById(R.id.button1);
        
        getAnswerButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String[] answers = {
						"It is certain",
						"It is decidedly so",
						"All signs say YES",
						"The stars are on aligned",
						"My reply is no",
						"It is doubtful",
						"Better not tell you now",
						"Concentrate and ask again",
						"Unable to answer now",
						"It is hard to say" };
				
				// The button was clicked, so update the answer label with an answer
				String answer = "";
				
				//Randomly select one of three answers: yes, no, maybe
				Random randomGenerator = new Random(); //Construct a new Random number generator
				int randomNumber = randomGenerator.nextInt(answers.length);
				
				/* Convert the RandomNumber to a text answer
				 * 0 = Yes
				 * 1 = No
				 * 2 = Maybe
				 */
				
				answer = answers[randomNumber];
	
				
				//Update the label with our dynamic answer
				answerLabel.setText(answer);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
