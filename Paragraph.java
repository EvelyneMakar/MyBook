public class Paragraph extends Section {
    String title;

    public Paragraph(String title){
        super();
        this.title = title;
    }

    public Paragraph() {

    }

    @Override
    public String toString(){
        return title;
    }
}