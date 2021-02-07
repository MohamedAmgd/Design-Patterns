public class AuthenticatedWebPage extends WebPageDecorator {

    public AuthenticatedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authenticateUser() {
        System.out.println("User authenticated");
    }

    @Override
    public void display() {
        super.display();
        this.authenticateUser();
    }

}
