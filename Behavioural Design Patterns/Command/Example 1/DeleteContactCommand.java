
public class DeleteContactCommand extends Command {
    private ContactList contact_list;
    private Contact contact;

    public DeleteContactCommand(ContactList contact_list, Contact contact) {
        this.contact_list = contact_list;
        this.contact = contact;
    }

    @Override
    public void execute() {
        contact_list.deleteContact(contact);
        setIsExecuted(contact_list.saveContacts());
    }
}
