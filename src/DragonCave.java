import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args){
        System.out.println("You are in a land full of dragons. In front you, \n" +
                "see two caves. In one cave, the dragon is friendly \n" +
                "and will share his treasure with you. the other dragon \n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1,2)");
        Scanner getInput = new Scanner(System.in);
        String input = getInput.nextLine();

        if ( input.equals("1")){
            System.out.println("You approach the cave... \n" +
                    "it is dark and spooky...\n" +
                    "A large dragon jumps out in front of you!\n" +
                    "He opens his jaws and...\n" +
                    "Gobbles you down in one bite!\n");
        } else if(input.equals("2")){
            System.out.println("You approach the cave... \n" +
                    "it is dark and spooky...\n" +
                    "A large dragon jumps out in front of you!\n" +
                    "He opens his jaws and...\n" +
                    "And Laugh saying: Take some of my Treasures!\n");
        } else {
            System.out.println("invalid Input");
        }
    };
}
