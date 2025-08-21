import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import org.json.JSONTokener;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {    
        try {
            System.out.print("Classes Quiz Initializing"); Thread.sleep(700);
            System.out.print(". "); Thread.sleep(500);
            System.out.print(". "); Thread.sleep(500);
            System.out.print(". "); Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner input_username_check = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nPlease enter your desired username.");

        String userName;

    if (input_username_check.hasNextLine()) {
        userName = input_username_check.nextLine();  // Read user input
        if ("No".equals(userName)) {
            System.out.println("Uncooperative. Not appreciated.");
            userName = "Common Joe";
        }
        System.out.println("Your username is: " + userName);  // Output user input
        } else {
            System.out.println("No input provided. Is input possible in your environment?");
            userName = "Common Joe";
        }
            input_username_check.close();
            Main.startQuiz(userName);
    }
    public static void startQuiz(String username) {
        try {
            Thread.sleep(1000); System.out.println("Quiz starting... "); 
            Thread.sleep(600); System.out.print("N ");
            Thread.sleep(500); System.out.print("O ");
            Thread.sleep(500); System.out.print("W ");
            Thread.sleep(500); System.out.print("!\n");
            Thread.sleep(500);
        } catch (InterruptedException e) {
        e.printStackTrace();
        System.out.print("Now");
        }
        Main.get_question(username);
    }
    public static void get_question(String username) {
        try {
            File quizdata = new File ("quiz.json");
            FileReader reader = new FileReader(quizdata);
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject jsonObject = new JSONObject(tokener);
            reader.close();
            System.out.println(jsonObject.toString(4));
            JSONObject question1Object = jsonObject.getJSONObject("question1");
            String questionValue = question1Object.getString("question");

            System.out.println("1st Question: " + questionValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}