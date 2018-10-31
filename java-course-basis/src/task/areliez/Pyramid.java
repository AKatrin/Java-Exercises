package task.areliez;

public class Pyramid {
    public static final String MESSAGE_TO_DRAW_PYRAMID = "Enter a positive whole number to draw the pyramid";
    public static final String NUMBER_GREATER_THAN_0_AND_LESS_THAN_51 = "You should a number greater than 0 and less than 51";
    public static final String ENTER_A_NEGATIVE_WHOLE_NUMBER_TO_EXIT = "You should enter a negative whole number to exit";
    public static final String EXITED_SUCCESSFULLY = "You exited successfully";
    private int numberRow;

    public Pyramid(){}

    public void drawRightTriangle(Pyramid p1, int numberRowEntered){
        System.out.println("The pyramid have " + numberRowEntered + " rows");
        p1.printRightTriangle(numberRowEntered);
        printMessages();
    }

    public void drawPyramid(Pyramid p1, int numberRowEntered){
        System.out.println("The pyramid have " + numberRowEntered + " rows");
        p1.printPyramid(numberRowEntered);
        printMessages();
    }

    public void printPyramid(int numberRow){
        this.numberRow = numberRow;
        if (numberRow >= 1 && numberRow <= 50)
            pyramid(numberRow);
        else
            System.out.println(NUMBER_GREATER_THAN_0_AND_LESS_THAN_51);
    }

    public void printRightTriangle(int numberRow){
        this.numberRow = numberRow;
        if (numberRow >= 1 && numberRow <= 50)
            printAsterisks(1,1);
        else
            System.out.println(NUMBER_GREATER_THAN_0_AND_LESS_THAN_51);
    }

    private void printAsterisks(int cantAsterisks, int row) {
        char ast = '*';
        if (row == 1){
            System.out.println(ast);
            printAsterisks(cantAsterisks+1,row+1);
        }
        else if (row <= numberRow){
            int asterisksByRow = cantAsterisks;
            while (asterisksByRow >= 1){
                System.out.print(ast);
                asterisksByRow--;
            }
            System.out.println();
            printAsterisks(cantAsterisks + 1,row+1);
        }
    }

    private void pyramid(int row){
        for (int i = 0; i < row; i++) {
            printCharacter(row,' ',i);
            printString(i,"* ");
            System.out.println();
            }


    }
    private void printString(int i, String character){
        for (int k = 0; k <= i; k++) {
            System.out.print(character);
        }
    }

    private void printCharacter(int row, char character, int i){
        for (int j = 0; j < row - i; j++) {
            System.out.print(character);
        }
    }


    private void printMessages() {
        System.out.println(MESSAGE_TO_DRAW_PYRAMID);
        System.out.println(ENTER_A_NEGATIVE_WHOLE_NUMBER_TO_EXIT);
    }
}
