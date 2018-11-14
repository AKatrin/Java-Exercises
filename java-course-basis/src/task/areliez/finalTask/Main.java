package task.areliez.finalTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //create a file
        FileCollection myDocuments = new FileCollection("Tasks");

        //Create documents
        Document documentOne = new Document("My first task", "this is my first task");
        Document documentTwo = new Document("My first task", "this is my first task");
        Document documentThree = new Document("My third task", "this is my third task");
        Document documentFour = new Document("My four task", "this is my four task");
        Document documentFive = new Document("My five task", "this is my five task");

        //Add documents to the file
        myDocuments.addDocument(documentOne);
        //Try add a document with title already exist
        myDocuments.addDocument(documentTwo);
        //add documents with different title
        myDocuments.addDocument(documentThree);
        myDocuments.addDocument(documentFour);
        myDocuments.addDocument(documentFive);

        //Show all documents with title, cant of chars, and date creation
        myDocuments.showCollectionDocuments();

        //display the content of the document
        myDocuments.showContentOfAnDocument(documentFive.getTitle());

        //Add a new document by console
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a title for the document");
        String titleDocument = keyboard.nextLine();
        System.out.println("Enter the content for the document");
        String content = keyboard.nextLine();

        Document document = new Document(titleDocument, content);

        myDocuments.addDocument(document);

        System.out.println("You can select the following options");
        System.out.println("Enter 1 to see the content of a document");
        System.out.println("Enter 2 to see the documents sort by date descending");
        System.out.println("Enter 3 to see the document sort by date ascending");
        System.out.println("Enter 4 to see document list with basic information");


        int numberOption = keyboard.nextInt();
        switch (numberOption) {
            case 1:
                System.out.println("Enter the title of document");
                Scanner sc = new Scanner(System.in);
                String titleDocumentToSee = sc.nextLine();
                myDocuments.showContentOfAnDocument(titleDocumentToSee);
                break;
            case 2:
                myDocuments.sortByDatedescending();
                myDocuments.showCollectionDocuments();
                break;
            case 3:
                myDocuments.sortByDateAscending();
                myDocuments.showCollectionDocuments();
                break;
            case 4:
                myDocuments.showCollectionDocuments();
                break;

                default:
                    new Exception("The option isn't valid");
        }


    }
}
