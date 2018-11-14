package task.areliez.finalTask;

import java.util.*;

public class FileCollection {

    private String name;

    private ArrayList<Document> documents;

    public FileCollection(String name) {
        this.name = name;
        documents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public void showCollectionDocuments(){
        if (!documents.isEmpty()){
            System.out.println(documents);
        }
    }

    public void addDocument(Document doc) {

        if (!existDocument(doc)){
            documents.add(doc);
        }
        else{
            System.out.println("A document with the title already exit");
        }

    }

    public boolean existDocument(Document doc){

        if (documents.contains(doc)){
            return true;
        }
        return false;
    }

    public String existDocumentWithTheTitle(int cantdocuments, String titleDocument) {
        for (int i = 0; i <= cantdocuments; i++) {
            Document doc = documents.get(i);
            if (doc.getTitle().equals(titleDocument))
                return doc.getContent();
        }
        return "the document with the title doesn't exist";

    }

    public void showContentOfAnDocument(String titleDocument){
        int cantdocuments = documents.size();
        if (!documents.isEmpty()){
            System.out.println(existDocumentWithTheTitle(cantdocuments,titleDocument));
        }
    }

    public void sortByDateAscending() {
        Collections.sort(documents, new SortByDate());
    }

    public void sortByDatedescending() {
        Collections.sort(documents, new SortByDate().reversed());
    }

}