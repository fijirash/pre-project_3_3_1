package ru.fijirash.pp.service;


import ru.fijirash.pp.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void removeUser(int id);
    User getUser(int id);
    void updateUser(int id, User user);
}
