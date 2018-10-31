package task.areliez.firstTask;

import java.util.InputMismatchException;
import java.util.Scanner;
import static task.areliez.firstTask.Pyramid.*;

public class MainPyramid {

    public static final String ONLY_POSITIVE_WHOLE_NUMBERS = "You should enter only positive whole numbers";
    public static final int NUMBER_TO_EXIT = -1;

    public static void main(String[] args) {

        Pyramid pyramid = new Pyramid();
        int numberRowEntered;

        Scanner keyboard = new Scanner(System.in);
        System.out.println(MESSAGE_TO_DRAW_PYRAMID);
        System.out.println(ENTER_A_NEGATIVE_WHOLE_NUMBER_TO_EXIT);
        numberRowEntered = keyboard.nextInt();

        startToDraw(pyramid, numberRowEntered, keyboard);
    }

    public static void startToDraw(Pyramid pyramid, int numberRowEntered, Scanner keyboard) {
        try {
            draw(pyramid, numberRowEntered, keyboard);
        }catch (InputMismatchException ex){
            keyboard.next();
            System.out.println(ONLY_POSITIVE_WHOLE_NUMBERS);
            numberRowEntered = keyboard.nextInt();
            startToDraw(pyramid,numberRowEntered,keyboard);
        }

    }

    private static void draw(Pyramid pyramid, int numberRowEntered, Scanner keyboard) {
        while (numberRowEntered > NUMBER_TO_EXIT) {
            pyramid.drawPyramid(pyramid,numberRowEntered);
            numberRowEntered = keyboard.nextInt();
        }

        if (numberRowEntered <= NUMBER_TO_EXIT)
            System.out.println(EXITED_SUCCESSFULLY);
    }
}
