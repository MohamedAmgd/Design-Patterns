public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authorizeUser() {
        System.out.println("User authorized");
    }

    @Override
    public void display() {
        super.display();
        this.authorizeUser();
    }
}
