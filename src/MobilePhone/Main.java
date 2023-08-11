package MobilePhone;

public class Main {
    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("111111111");
        phone.addNewContact(new Contact("Bob", "31415926"));
        phone.addNewContact(new Contact("Alice", "16180339"));
        phone.addNewContact(new Contact("Tom", "11235813"));
        phone.addNewContact(new Contact("Jane", "23571113"));
        //phone.printContact();
        Contact derya = new Contact("derya", "0567890");
        phone.addNewContact(derya);
        //phone.printContact();
        Contact Derya = new Contact("Derya", "05678900");
        phone.updateContact(derya, Derya);
        phone.printContact();
        phone.removeContact(Derya);
        //phone.printContact();
        phone.addNewContact(Derya);
        System.out.println(phone.findContact(Derya));
        System.out.println(phone.findContact("Derya"));
        System.out.println(phone.queryContact("Derya"));
    }
}
