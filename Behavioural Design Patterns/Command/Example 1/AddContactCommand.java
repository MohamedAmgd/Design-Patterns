public class AddContactCommand extends Command {
    private ContactList contact_list;
    private Contact contact;

    public AddContactCommand(ContactList contact_list, Contact contact) {
        this.contact_list = contact_list;
        this.contact = contact;
    }

    @Override
    public void execute() {
        contact_list.addContact(contact);
        setIsExecuted(contact_list.saveContacts());
    }
}
