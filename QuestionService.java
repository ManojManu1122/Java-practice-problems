import java.util.*;

public class QuestionService {

    String selection[] = new String[5];

    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "Which of the following is Object oriented Programming language", "A.C#",
                "B.C++", "C.Java", "D.SQL", "C");
        questions[1] = new Question(2, "Which of the following is Interpreted Programming language", "A.Python",
                "B.C++", "C.Java", "D.SQL", "A");
        questions[2] = new Question(3, "Which of the following is related to database management system", "A.C#",
                "B.C++", "C.Java", "D.SQL", "D");
        questions[3] = new Question(4, "Which of the following is not a Programming language", "A.C#", "B.Telugu",
                "C.Java", "D.SQL", "B");
        questions[4] = new Question(5, "Which of the following is a Programming language", "A.C#", "B.C++", "C.Java",
                "D.All of the above", "D");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {

            System.out.println(q.getId() + ") " + q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }

        for (String s : selection) {
            System.out.println("Your selected Answer is " + s);
        }
    }

    public void quizScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAns();
            String userAnswer = selection[i].toUpperCase();
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }

        }
        System.out.println("Your score is :" + score + " out of 5");

    }

}
