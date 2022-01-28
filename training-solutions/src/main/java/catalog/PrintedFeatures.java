package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {

    private String title;
    private int numberOfPages;
    private List<String> authors = new ArrayList<>();

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("Empty list");
        }
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("invalid page number");
        }

        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }
}
