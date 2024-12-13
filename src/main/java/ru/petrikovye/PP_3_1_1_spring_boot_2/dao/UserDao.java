package ru.petrikovye.PP_3_1_1_spring_boot_2.dao;

import ru.petrikovye.PP_3_1_1_spring_boot_2.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User findUserById(long id);
}
