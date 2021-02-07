public class Program {
    public static void main(String[] args) {
        WebPage page = new BasicWebPage();
        page = new AuthenticatedWebPage(page);
        page = new AuthorizedWebPage(page);
        page.display();
    }
}
