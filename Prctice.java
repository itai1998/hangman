import java.util.Random;
import java.util.Scanner;

public class Prctice {
	
	public static void main(String[] args) {
		


//-------------------------------------------------------------
		int sum = 0;
		int score = 0;
		int count = 1;
		int play = 0;
		int yes = 0;
		String again;

		
	while(play<1) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int x = random.nextInt(10);
	
		String[] words = {"apple","computer","mouth","phone","microphone","university","earth","space","eight","student"};
		String question = words[x];
		int number = question.length();
		
		String[] guess = new String[number];
		char[] right = new char[number];
//		char[] guess = new char[number];

		
		for(int i=0;i<number;i++) {
//			guess[i] = '_';
 			guess[i] = "_";
			right[i] = question.charAt(i);
		}
		
		
		System.out.println(question);
		
		
		
		
		System.out.println("Welcome to the game! Please guess the answer!");
		System.out.println("They are "+ number +" words that you need to guess");
		System.out.println();
		
		for(String i: guess) {
			System.out.print(i);
			System.out.print(" ");
		}
		
	
	
		while(score !=number) {	
				
				System.out.println();
				System.out.println();
				System.out.println("This is your "+count+" guess! correct: "+score+ " Incorrect: "+sum );
				String answer = scanner.next();
				
				//--------------------------//
				for(int i=0;i<number;i++) {
					if(answer.equals(Character.toString(right[i])) && !guess[i].equals(answer)) {
						System.out.println();
						System.out.println("Good job! you are right!");
						
						guess[i] = answer;
						System.out.println();
						for(String j: guess) {
							System.out.print(j);
							System.out.print(" ");
						}
						
						score+=1;
						count+=1;
						break;
					}
					else if(i==number-1) {
						System.out.println();
						System.out.println("Opps! it is not in the word!");
						
						for(String k: guess) {
							System.out.print(k);
							System.out.print(" ");
						}
						sum+=1;
						count+=1;
						
					}
				
					
				}
				
				
				
				

		}
		
		if(score==number) {
			play=0;
			System.out.println();
			System.out.println();
			System.out.println("You win the game");
			System.out.println("This is your "+count+" guess! correct: "+score+ " Incorrect: "+sum );
			System.out.println();
			System.out.println("Do you want to try again? y/n");
		}
		else {
			play=0;
			System.out.println();
			System.out.println();
			System.out.println("You lost the game");
			System.out.println("Do you want to try again? y/n ");
		}
	
	again=scanner.next();
	
	if(again.equals("y")) {
		sum=0;
		score=0;
		count=1;
	}
	else if(again.equals("n")) {
		System.out.println("Don't want to play");
		break;
	}
	else {
		System.out.println("");
	}
	
	}	
		
		
		
	}

}

 