package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private int userID;
    private String username;
    private char gender;
    private LocalDate dateOfBirth;
    private int postsNumber;

    public ForumUser(final int userID,final String username,final char gender,final LocalDate dateOfBirth,final int postsNumber) {
        this.userID = userID;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postsNumber = postsNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
