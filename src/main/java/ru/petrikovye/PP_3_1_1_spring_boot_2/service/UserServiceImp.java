package ru.petrikovye.PP_3_1_1_spring_boot_2.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.petrikovye.PP_3_1_1_spring_boot_2.dao.UserDao;
import ru.petrikovye.PP_3_1_1_spring_boot_2.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(long id) {
       userDao.deleteUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User findUserById(long id){
        return userDao.findUserById(id);
    }
}
