package task.areliez;

import java.util.InputMismatchException;
import java.util.Scanner;
import static task.areliez.Pyramid.*;

public class MainPyramid {

    public static void main(String[] args) {

        Pyramid p1 = new Pyramid();
        int numberRowEntered;

        Scanner keyboard = new Scanner(System.in);
        System.out.println(MESSAGE_TO_DRAW_PYRAMID);
        System.out.println(ENTER_A_NEGATIVE_WHOLE_NUMBER_TO_EXIT);
        numberRowEntered = keyboard.nextInt();

        startToDraw(p1, numberRowEntered, keyboard);
    }

    public static void startToDraw(Pyramid p1, int numberRowEntered, Scanner keyboard) {
        try {
            draw(p1, numberRowEntered, keyboard);
        }catch (InputMismatchException ex){
            keyboard.next();
            System.out.println("You should enter only numbers");
            draw(p1,numberRowEntered,keyboard);
        }

    }

    private static void draw(Pyramid p1, int numberRowEntered, Scanner keyboard) {
        while (numberRowEntered > -1) {
            p1.draw(p1,numberRowEntered);
            numberRowEntered = keyboard.nextInt();
        }

        if (numberRowEntered <= -1)
            System.out.println(EXITED_SUCCESSFULLY);
    }
}
