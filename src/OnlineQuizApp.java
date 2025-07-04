import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Question {
    String question;
    String[] opt;
    int correctOption;


public Question(String question, String[]opt, int correctOption){

    this.question = question;
    this.opt = opt;
    this.correctOption = correctOption;
}
public void display(){
    System.out.println("\n" +question);
for(int i = 0; i<opt.length; i++){
    System.out.println((i + 1)+ "." + opt[i]);
}

}


public boolean isCorrectQuiz(int answer){

 return answer == correctOption;
        }
}

public class OnlineQuizApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Which country has the highest life expectancy?", new String[]{"Hong kong","Delhi", "Mumbai", "Dubai"}, 1));
        questions.add(new Question("What company was initially known as \"Blue Ribbon Sports\"? ", new String[]{"Puma","Reebok", "Spark", "Nike"}, 4));
        questions.add(new Question("How many dots appear on a pair of dice?", new String[]{"12","42", "20", "10"}, 2));
        questions.add(new Question("Which planet in the Milky Way is the hottest?", new String[]{"Mars","Venus", "Jupiter", "Neptune"}, 2));
        questions.add(new Question("What is the smallest unit of matter? ", new String[]{"Atom","Molecules", "Matels", "Platinum"}, 1));
        questions.add(new Question("Where did sushi originate? ", new String[]{"Japan","China", "Spain", "USA"}, 1));
        questions.add(new Question("Where is the strongest human muscle located?", new String[]{"Jaw","Hand", "Legs", "Thigh"}, 1));
        questions.add(new Question("In which country was Elon Musk born?", new String[]{"South Africa", "United State", "Japan", "NewYork"}, 1));

    int score = 0;
    int questionNumber = 1;

        System.out.println("Welcome to the Java Console Based Quiz App!");
        for(Question q : questions){
            System.out.println("\nQuestion " + questionNumber +":");
            q.display();
            System.out.println("Enter your answer(1-8): ");
            int answer = sc.nextInt();

            if(q.isCorrectQuiz(answer)){
                System.out.println("Correct..");
                score++;
            }else{
                System.out.println("Incorrect! Correct answer: " +q.opt[q.correctOption-1]);
            }
            questionNumber++;
        }
        System.out.println("\n Quiz Completed!");
        System.out.println("Your Score: " +score+ " out of " +questions.size());

        if(score == questions.size()){
            System.out.println("Good Job!");
        }else{
            System.out.println("Keep Practicing!");
        }
        sc.close();
    }
}