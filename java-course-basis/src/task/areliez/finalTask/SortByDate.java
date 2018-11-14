package task.areliez.finalTask;

import java.util.Comparator;

public class SortByDate implements Comparator<Document> {

    public int compare(Document docOne, Document docTwo) {
        return docOne.getDateCreation().compareTo(docTwo.getDateCreation());
    }
}
