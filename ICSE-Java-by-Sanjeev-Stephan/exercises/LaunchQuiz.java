package exercises;


/**
 * Write a description of class MultipleChoiceQuestions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LaunchQuiz {

    static class Question {
        String question;
        String[] options;
        char answer;

        Question(String question, String[] options, char answer) {
            this.question = question;
            this.options = options;
            this.answer = answer;
        }

        void display() {
            System.out.println(question);
            for (int i = 0; i < options.length; i++) {
                System.out.println((char)('A' + i) + ") " + options[i]);
            }
        }
    }

    
        // Add this method inside your StudentQuiz class
    public static List<Question> loadQuestionsFromFile(String filename) throws IOException {
        List<Question> questions = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String qText = line;
            String[] options = new String[4];
            for (int i = 0; i < 4; i++) {
                options[i] = reader.readLine();
            }
            char correct = reader.readLine().toUpperCase().charAt(0);
            questions.add(new Question(qText, options, correct));
        }
        reader.close();
        return questions;
    }

    
    
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        List<Question> questions = loadQuestionsFromFile("questions.txt");

   /*
    *      List<Question> questions = new ArrayList<>();

        // Sample questions
        questions.add(new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 'C'));
        questions.add(new Question("2 + 2 = ?", new String[]{"3", "4", "5", "6"}, 'B'));
        questions.add(new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Venus", "Mars", "Jupiter"}, 'C'));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?", new String[]{"Shakespeare", "Dickens", "Austen", "Hemingway"}, 'A'));
    */

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.print("How many questions do you want to answer? ");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Ensure we don't exceed available questions
        numQuestions = Math.min(numQuestions, questions.size());

        // Shuffle and pick the number of questions requested
        Collections.shuffle(questions);
        List<Question> quiz = questions.subList(0, numQuestions);

        StringBuilder result = new StringBuilder();
        result.append("Student: ").append(name).append("\n");
        result.append("Test Date: ")
              .append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
              .append("\n\n");

        int score = 0;
        for (int i = 0; i < quiz.size(); i++) {
            Question q = quiz.get(i);
            System.out.println("\nQuestion " + (i + 1) + ":");
            q.display();
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);
            result.append("Q").append(i + 1).append(": ").append(q.question).append("\n")
                  .append("Your answer: ").append(userAnswer)
                  .append(userAnswer == q.answer ? " (Correct)" : " (Wrong, correct: " + q.answer + ")")
                  .append("\n\n");
            if (userAnswer == q.answer) score++;
        }

        result.append("Final Score: ").append(score).append(" out of ").append(numQuestions).append("\n");

        // Save to file
        String fileName = name.replaceAll("\\s+", "_") + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(result.toString());
        }

        System.out.println("\nQuiz completed! Results saved to " + fileName);
    }
}


