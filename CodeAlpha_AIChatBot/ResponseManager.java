import java.util.HashMap;

public class ResponseManager {

    private HashMap<String, String> responses;

    public ResponseManager() {

        responses = new HashMap<>();

        responses.put("hi", "Hello! Welcome to CodeAlpha AI ChatBot.");
        responses.put("hello", "Hi! Nice to meet you.");
        responses.put("how are you", "I'm doing great. Hope you're doing well too!");
        responses.put("java", "Java is a powerful Object-Oriented Programming language.");
        responses.put("oop", "OOP stands for Object-Oriented Programming.");
        responses.put("college", "Study consistently and practice coding daily.");
        responses.put("bye", "Goodbye! Have a wonderful day.");
        responses.put("thank you", "You're welcome!");
        responses.put("internship", "Internships help you gain practical experience.");
    }

    public String getResponse(String message) {

        message = message.toLowerCase();

        for (String key : responses.keySet()) {

            if (message.contains(key)) {
                return responses.get(key);
            }
        }

        return "Sorry, I don't understand that. Please try another question.";
    }
}
