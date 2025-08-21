import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

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
        String filePath = new File("").getAbsolutePath();
        System.out.println(filePath);
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:/Users/2844108/OneDrive - EDEKA/Dokumente/Java Projects/Java Quiz/src/main/resources/quiz.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("name");
            System.out.printf("My name is %s", name);
            // String value = (String) ((JSONObject) ((JSONObject) ((JSONArray) new JSONParser().parse("[{ \"question1\": { \"question\": \"How is a method used in an instance?\"}]")).get(0)).get("question1")).get("question");
            // System.out.println(value);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}