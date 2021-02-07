public class WebPageDecorator implements WebPage {

    protected WebPage page;

    public WebPageDecorator(WebPage page) {
        this.page = page;
    }

    @Override
    public void display() {
        page.display();
    }

}
