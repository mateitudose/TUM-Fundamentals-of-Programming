package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String findContactNumber(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact.getPhoneNumber();
            }
        }
        return null;
    }

    public void addNewContact(String name, String phoneNumber, boolean isBayernPlayer) {
        contacts.add(new Contact(name, phoneNumber, isBayernPlayer));
    }

    public Contact removeContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                return contact;
            }
        }
        return null;
    }

    public Contact updateContactNumber(String name, String newNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setPhoneNumber(newNumber);
                return contact;
            }
        }
        return null;
    }

    public List<Contact> findBayernPlayers() {
        List<Contact> bayernPlayers = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getIsBayernPlayer()) {
                bayernPlayers.add(contact);
            }
        }
        return bayernPlayers;
    }
}
