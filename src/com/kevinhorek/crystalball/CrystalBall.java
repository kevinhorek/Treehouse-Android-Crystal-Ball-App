package com.kevinhorek.crystalball;

import java.util.Random;

public class CrystalBall {
	
	// Member variables (properties about the object)
	public String[] mAnswers = {
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
	
	// Methods (Things objects can do)
	public String getAnAnswer() {
		
		String answer = "";
		
		//Randomly select one of three answers: yes, no, maybe
		Random randomGenerator = new Random(); //Construct a new Random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		
		return answer;
	}
}
