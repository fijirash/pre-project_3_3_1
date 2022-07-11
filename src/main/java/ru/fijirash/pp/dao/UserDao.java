package ru.fijirash.pp.dao;


import ru.fijirash.pp.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void addUser(User user);
    void removeUser(int id);
    User getUser(int id);
    void updateUser(int id, User user);
}
