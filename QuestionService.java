package quiz_console;

public class QuestionService {

    private Question[] questions;

    public QuestionService() {
        questions = new Question[5];
        questions[0] = new Question(1, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        questions[1] = new Question(2, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        questions[2] = new Question(3, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        questions[3] = new Question(4, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
        questions[4] = new Question(5, "What programming language is this written in?", "Java", "C++", "Python", "Rust", "Java");
    }
    public void displayQuestions() {
        for (Question q : questions) {
            System.out.println(q);
        }
    }

}
