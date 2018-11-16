package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"Max", 'M', LocalDate.of(1989, 1,1), 1));
        userList.add(new ForumUser(2,"Pax", 'M', LocalDate.of(1991, 2,2), 2));
        userList.add(new ForumUser(3,"Gax", 'M', LocalDate.of(1993, 3,3), 3));
        userList.add(new ForumUser(4,"Dax", 'M', LocalDate.of(1999, 4,4), 4));
        userList.add(new ForumUser(5,"Aax", 'M', LocalDate.of(2002, 5,5), 5));
        userList.add(new ForumUser(6,"Penny", 'F', LocalDate.of(1989, 6,6), 1));
        userList.add(new ForumUser(7,"Menny", 'F', LocalDate.of(1991, 7,7), 2));
        userList.add(new ForumUser(8,"Eenny", 'F', LocalDate.of(1993, 8,8), 3));
        userList.add(new ForumUser(9,"Fenny", 'F', LocalDate.of(1999, 9,9), 4));
        userList.add(new ForumUser(10,"Lenny", 'F', LocalDate.of(2003, 10,10), 5));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
