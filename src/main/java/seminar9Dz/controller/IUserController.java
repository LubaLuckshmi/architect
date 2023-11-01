package seminar9Dz.controller;


import seminar9Dz.exeptions.UserNotFountException;
import seminar9Dz.model.User;

import java.util.List;

public interface IUserController {
    User addUser(String userName);
    User deleteUser(int userId) throws UserNotFountException;
    List<User> getUsers();
    void addAll(List<User> listUsers);
}