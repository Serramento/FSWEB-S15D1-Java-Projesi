package tr.com.workintech.mobilePhone;

public class Main {
    public static void main(String[] args) {

        MobilePhone phone= new MobilePhone("123456789");

        phone.addNewContact(Contact.createContact("Bob", "31415926"));
        phone.addNewContact(Contact.createContact("Alice", "52367842"));
        phone.addNewContact(Contact.createContact("Tom", "56982356"));
        phone.addNewContact(Contact.createContact("Jane", "14856932"));

        phone.printContact();
        Contact emre= new Contact("Emre","12352665");
        phone.addNewContact(emre);
        System.out.println(phone.findContact("Alice"));
        System.out.println(phone.findContact(emre));
    }
}
