package com.LR2.contacts;

public class Main {

    public static void main(String[] args) {
        Contact cont1 = new Contact("fffff",6666);
                cont1.setName("Igor");
                cont1.setPhoneNumber(222222);

                Address address = new Address();
                address.setIndex(54666);
                address.setPersonalAdress("Kanatnaya 20");

                cont1.setAddress(address);

    }
}
