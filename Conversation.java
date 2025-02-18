import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Conversation implements Chatbot {

    // Attributes 
    int rounds;
    String words;
    ArrayList<String> transcript;

    /**
     * Constructor
     */
    Conversation(int rounds, String words, ArrayList<String> transcript) {
        this.rounds = rounds;
        this.words = words;
        this.transcript = new ArrayList<>();
    }

    /**
     * Starts and runs the conversation with the user
     */
    public void chat() {
        /**
         
         */
        System.out.println("How many rounds?");
        Scanner input = new Scanner(System.in); //ask for user's input
        rounds = input.nextInt(); 
        input.nextLine(); // Make sure the program does not take 'enter' as the user input

        if (rounds > 0) {
            System.out.println("Hi there!  What's on your mind?"); // go into transcript
        }

        for (int i = 0; i < rounds; i++) { //add use's reponse to transcrpt and print our reponse
            words = input.nextLine(); // go into ArrayList 'transcript'
            transcript.add(words);
            System.out.println(respond(words));
            transcript.add(respond(words));
        }
        System.out.println("See ya!");
        transcript.add("See ya!");
    }

    /**
     * Prints transcript of conversation
     */
    public void printTranscript() { //ArrayList
        System.out.println("\nTRANSCRIPT:");
        for (int i = 0; i < transcript.size(); i++) {
            System.out.println(transcript.get(i));
        }
    }

    /**
     * Gives appropriate response (mirrored or canned) to user input
     *
     * @param words the users last line of input
     * @return mirrored or canned response to user input
     */
    public String respond(String words) { //Two ways: 1. for loop+case, 2. Use two Lists
        String newWords[] = words.split(" ");

        String[] response = { //five random responses
                "Nice",
                "Interesting!",
                "Good",
                "Okay!",
                "Wow!"
        };
        Random random = new Random();
        int index = random.nextInt(5); //index is from 0-4

        boolean changed = false;

        //   to see if words match words
        for (int j = 0; j < newWords.length; j++) {
            if (newWords[j].equals("I")) {
                newWords[j] = "You";
                changed = true;
            } else if (newWords[j].equals("You") || newWords[j].equals("you")) {
                newWords[j] = "I";
                changed = true;
            } else if (newWords[j].equals("am")) {
                newWords[j] = "are";
                changed = true;
            } else if (newWords[j].equals("are")) {
                newWords[j] = "am";
                changed = true;
            } else if (newWords[j].equals("my")) {
                newWords[j] = "your";
                changed = true;
            } else if (newWords[j].equals("your")) {
                newWords[j] = "my";
                changed = true;
            }
        }
        if (changed) {
            ArrayList<String> sentence = new ArrayList<>();
            for (String word : newWords) {
                sentence.add(word);
            }

            // Convert ArrayList to string with spaces between words
            String newSentence = String.join(" ", sentence);
            return newSentence;
        } else {
            return response[index];
        }
    }
    //    public static void main(String[] arguments) {
//
//        Conversation myConversation = new Conversation(rounds, words, transcript);
//        myConversation.chat();
//        myConversation.printTranscript();
//    }
    public static void main(String[] args) {
        // Initialize with default values that will be overwritten in chat()
        int initialRounds = 0;
        String initialWords = "";
        ArrayList<String> initialTranscript = new ArrayList<>();

        // Create a new Conversation instance
        Conversation myConversation = new Conversation(initialRounds, initialWords, initialTranscript);

        // Start the conversation
        myConversation.chat();

        // Print the transcript after the conversation ends
        myConversation.printTranscript();
    }
}

