package quiz_console;

import java.util.Scanner;

public class QuestionService {

    private Question[] questions;
    private String[] selections;

    public QuestionService() {
        questions = new Question[5];
        questions[0] = new Question(1, "What programming language is this written in?", new String[] {"Java", "C++", "Python", "Rust"}, "Java");
        questions[1] = new Question(2, "Which fast food restaurant?", new String[] {"Innout", "Five Guys", "Mcdonalds", "Burger King"}, "Innout");
        questions[2] = new Question(3, "Which operating system?", new String[] {"Windows", "MacOS", "Linux", "Android"}, "MacOS");
        questions[3] = new Question(4, "Which country am I in?", new String[] {"China", "Korea", "Mexico", "USA"}, "USA");
        questions[4] = new Question(5, "Favorite number?", new String[] {"2", "1", "314", "293"}, "314");
        selections = new String[5];
    }
    public void playQuiz() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println("Question " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOptions()[0]);
            System.out.println(q.getOptions()[1]);
            System.out.println(q.getOptions()[2]);
            System.out.println(q.getOptions()[3]);
            selections[i] = scanner.nextLine();
            i ++;
        }
        scanner.close();
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
