package edu.cscc;

/**
 * Created by 119770 on 3/10/2020.
 */
public class ContactPhone extends Contact{
    private String phone;

    @Override
    void contact(String phone) {
        System.out.println("Calling " + phone);
    }
}
