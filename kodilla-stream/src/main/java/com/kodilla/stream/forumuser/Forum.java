package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum()
    {
        userList.add(new ForumUser(123,"user1",'m', LocalDate.of(1999,5,19),101));
        userList.add(new ForumUser(124,"user2",'f', LocalDate.of(1985,7,30),3));
        userList.add(new ForumUser(125,"user3",'m', LocalDate.of(1987,5,13),59));
        userList.add(new ForumUser(126,"user4",'f', LocalDate.of(1992,10,9),87));
        userList.add(new ForumUser(127,"user5",'m', LocalDate.of(2001,9,14),264));
        userList.add(new ForumUser(128,"user6",'m', LocalDate.of(2009,12,15),36));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
