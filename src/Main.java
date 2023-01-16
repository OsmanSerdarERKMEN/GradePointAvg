import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double math, physics, chemistry, english, history, music;

        System.out.println("Math Grade: ");
        math = input.nextDouble();

        System.out.println("Physics Grade: ");
        physics = input.nextDouble();

        System.out.println("Chemistry Grade: ");
        chemistry = input.nextDouble();

        System.out.println("English Grade: ");
        english = input.nextDouble();

        System.out.println("History Grade: ");
        history = input.nextDouble();

        System.out.println("Music Grade: ");
        music = input.nextDouble();

        double avg = (math + physics + chemistry + english + history + music) / 6 ;

        System.out.println("Your average score is : " + avg + " points!");
        String rating = (avg >= 60 ? "Pass!" : "Fail!");
        System.out.println(rating);
    }
}