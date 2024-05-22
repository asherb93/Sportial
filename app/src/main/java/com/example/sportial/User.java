package com.example.sportial;

import java.io.File;
import java.util.HashMap;

enum Gender {Female, Male, Other};

public class User {
    private final String email;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String country;
    private final Gender gender;
    private final HashMap<SportType, Integer> sportTypes;
    private final File profilePicture;

    public User(String email, String password, String firstName, String lastName, String city, String country, Gender gender, HashMap<SportType, Integer> sportTypes, File profilePicture) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.country = country;
        this.gender = gender;
        this.sportTypes = sportTypes;
        this.profilePicture = profilePicture;
    }

    public String getEmail() {
        return email;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Gender getGender() {
        return gender;
    }

    public HashMap<SportType, Integer> getSportTypes() {
        return sportTypes;
    }

    public File getProfilePicture() {
        return profilePicture;
    }
}