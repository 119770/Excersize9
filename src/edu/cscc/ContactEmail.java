package edu.cscc;

/**
 * Created by 119770 on 3/10/2020.
 */
public class ContactEmail extends Contact {
    private String email;

    @Override
    void contact(String email) {
        System.out.println("Emailing " + email);
    }
}
