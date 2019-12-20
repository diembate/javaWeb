package com.codegym.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Component
@Entity
@Table(name ="user")
public class User implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotEmpty
    @Size(min = 5, max = 45)
    @Column(name = "Firstname")
    private String Firstname;


    @NotEmpty
    @Size(min = 5, max = 45)
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "phone_number")
    private String phone_number;

    @Min(18)
    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;

        String phone_number = user.getPhone_number();
        ValidationUtils.rejectIfEmpty(errors, "number", "number.empty");
        if (phone_number.length() > 11 || phone_number.length() < 10) {
            errors.rejectValue("number", "number.length");
        }
        if (!phone_number.startsWith("0")) {
            errors.rejectValue("number", "number.startsWith");
        }
        if (!phone_number.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("number", "number.matches");
        }

        String Email = user.getEmail();
        ValidationUtils.rejectIfEmpty(errors, "Email", "Email.empty");

        if (!Email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) ;
        {
            errors.rejectValue("Email", "Email.matches");
        }


    }
}

