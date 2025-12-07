package quiz_console;

import java.util.Scanner;

public class QuestionService {

    private Question[] questions;
    private String[] selections;

    public QuestionService() {
        questions = new Question[5];
        questions[0] = new Question(1, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        questions[1] = new Question(2, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        questions[2] = new Question(3, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        questions[3] = new Question(4, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        questions[4] = new Question(5, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        selections = new String[5];
    }
    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());
            Scanner scanner = new Scanner(System.in);
            selections[i] = scanner.nextLine();
            i ++;
        }
        System.out.println("Your selections are:");
        for (String s : selections) {
            System.out.println(s);
        }
    }
    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i ++) {
            if (questions[i].getAnswer().equalsIgnoreCase(selections[i])) {
                score ++;
            }
        }
        System.out.println("Your score is: " + score);
    }

}
