package org.academiadecodigo.bootcamp65.services;

import org.academiadecodigo.bootcamp65.model.User;

import java.util.LinkedList;
import java.util.List;

public interface UserService {

    List<User> list();

    User save(User user);

    void remove(int id);

    User update(User user);

    User get(int id);
}
