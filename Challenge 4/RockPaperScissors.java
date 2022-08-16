import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play.
        System.out.println("Do you want to play? Yes or no?");
        String decision = scan.nextLine();

    /*Task 2: Set up the game
    

       • if the answer is yes: 
             – print: Great!
             – print: rock – paper – scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:
             – print: Darn, some other time...!        
    */
        switch (decision) {
            case "yes": System.out.println("Great!");
                        System.out.println("rock – paper – scissors, shoot!");
                        String choice = scan.nextLine();
                        String opponent = computerChoice();
                        String gameResult = result(choice, opponent);
                        printResult(choice, opponent, gameResult);
            default: System.out.println("Darn, some other time...!");
        }

        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        if ((int)(3*Math.random()) == 0) {
            return "rock";
        } else if ((int)(3*Math.random()) == 1) {
            return "paper";
        }
        else {
            return "scissors";
        }
    }



    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   1. result is "You win" if:
     * 
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     * 
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     * 
     *   3. result is "It's a tie" if:
     * 
     *       your choice equals computer choice.
     *   
     */
    public static String result(String yourChoice, String computerChoice) {
        switch (yourChoice) {
            case "rock": switch (computerChoice) {
                case "rock": return "It's a tie";
                case "paper": return "You Lose";
                case "scissors": return "You Win";
                default: return null;
                }
            case "paper": switch (computerChoice) {
                case "rock": return "You Win";
                case "paper": return "It's a tie";
                case "scissors": return "You Lose";
                default: return null;
                }
            case "scissors": switch (computerChoice) {
                case "rock": return "You Lise";
                case "paper": return "You Win";
                case "scissors": return "It's a tie";
                default: return null;
                }
            default: return null;
        }
    }

 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }

}
