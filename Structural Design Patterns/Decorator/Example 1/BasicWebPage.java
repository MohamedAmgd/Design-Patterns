public class BasicWebPage implements WebPage {

    public String html;
    public String styleSheet;
    public String scripts;

    @Override
    public void display() {
        System.out.println("Basic Web Page");
    }

}
