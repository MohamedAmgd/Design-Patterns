
public class EditContactCommand extends Command {

    private ContactList contact_list;
    private Contact old_contact;
    private Contact new_contact;

    public EditContactCommand(ContactList contact_list, Contact old_contact, Contact new_contact) {
        this.contact_list = contact_list;
        this.old_contact = old_contact;
        this.new_contact = new_contact;
    }

    @Override
    public void execute() {
        contact_list.deleteContact(old_contact);
        contact_list.addContact(new_contact);
        setIsExecuted(contact_list.saveContacts());
    }
}
