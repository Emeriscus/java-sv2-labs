package polymorphism.architect;

public class SketchPlan extends Plan {

    protected String title;

    @Override
    public int getPagesOfDocumentation() {
        return pagesOfDocumentation;
    }

    public SketchPlan(int pagesOfDocumentation, String title) {
        super(pagesOfDocumentation);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
