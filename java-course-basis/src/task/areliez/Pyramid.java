package task.areliez;

import java.util.Scanner;

public class Pyramid {
    private int numberRow;

    public Pyramid(){}

    public void printPyramid(int numberRow){
        this.numberRow = numberRow;
        if (numberRow >= 1)
            printAsterisks(1,1);
        else
            System.out.println("You should a number greater than 0");
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
            printAsterisks(cantAsterisks+1,row+1);
        }
    }

    public static void main(String[] args) {

        Pyramid p1 = new Pyramid();
        int numberRow;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter a number for the rows of the pyramid");
        numberRow = teclado.nextInt();
        System.out.println("The pyramid have " + numberRow + " rows");
        p1.printPyramid(numberRow);

    }
}
