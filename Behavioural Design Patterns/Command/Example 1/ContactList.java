import java.util.ArrayList;

/**
 * ContactList class
 */
public class ContactList {

    private static ArrayList<Contact> contacts;

    public ContactList() {
        contacts = new ArrayList<Contact>();
    }

    public void setContacts(ArrayList<Contact> contact_list) {
        contacts = contact_list;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public ArrayList<String> getAllUsernames() {
        ArrayList<String> username_list = new ArrayList<String>();
        for (Contact u : contacts) {
            username_list.add(u.getUsername());
        }
        return username_list;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public int getSize() {
        return contacts.size();
    }

    public Contact getContactByUsername(String username) {
        for (Contact c : contacts) {
            if (c.getUsername().equals(username)) {
                return c;
            }
        }
        return null;
    }

    public boolean hasContact(Contact contact) {
        for (Contact c : contacts) {
            if (contact.getId().equals(c.getId())) {
                return true;
            }
        }
        return false;
    }

    public int getIndex(Contact contact) {
        int pos = 0;
        for (Contact c : contacts) {
            if (contact.getId().equals(c.getId())) {
                return pos;
            }
            pos = pos + 1;
        }
        return -1;
    }

    public boolean isUsernameAvailable(String username) {
        for (Contact c : contacts) {
            if (c.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public boolean saveContacts() {
        return true;
    }
}