package task.areliez.finalTask;

import java.util.Date;
import java.util.Objects;

public class Document {
    private String title;
    private int cantChars;
    private Date dateCreation;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
        this.dateCreation = new Date();
        this.cantChars = content.length();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCantChars() {
        return cantChars;
    }

    public int setCantChars(int cantChars) {
        this.cantChars = cantChars;
        return cantChars;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(getTitle(), document.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + getTitle() + '\'' +
                ", cantChars=" + getCantChars() +
                ", dateCreation=" + getDateCreation() +
                '}';
    }
}
