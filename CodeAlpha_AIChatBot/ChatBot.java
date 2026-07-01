import java.util.Scanner;

public class ChatBot {

    private ResponseManager responseManager;

    public ChatBot() {
        responseManager = new ResponseManager();
    }

    public void startChat() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("     Welcome to AI ChatBot");
        System.out.println("=====================================");
        System.out.println("Type 'exit' to end the conversation.\n");

        while (true) {

            System.out.print("You : ");
            String userMessage = scanner.nextLine();

            if (userMessage.equalsIgnoreCase("exit")) {
                System.out.println("Bot : Thank you! Have a nice day.");
                break;
            }

            String response = responseManager.getResponse(userMessage);

            System.out.println("Bot : " + response);
            System.out.println();
        }

        scanner.close();
    }
}
