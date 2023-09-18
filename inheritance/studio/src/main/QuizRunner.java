import Questions.*;

public class QuizRunner {

    private static final Quiz quiz = new Quiz();
    public static void main(String[] args) {
        //create questions
        String question1 =  "Which of these are months?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Apple"),
                new Choice("November", true),
                new Choice("January", true),
                new Choice("Pencils")
        };
        Checkbox q1 = new Checkbox(question1, q1Choices);

        String question2 = "Pineapples are good on pizza.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True"),
                new Choice("False", true)
        };
        TrueFalse q2 = new TrueFalse(question2, q2Choices);

        String question3 = "What is the answer to 24 times 313?";
        Choice[] q3Choices = new Choice[] {
                new Choice("4"),
                new Choice("7512",true),
                new Choice("24313"),
                new Choice("49548")
        };
        MultipleChoice q3 = new MultipleChoice(question3, q3Choices);


        //add questions to the quiz
        quiz.addQuestion(new Question[] {q1, q2, q3});

        //interact with user
        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);
    }
}
