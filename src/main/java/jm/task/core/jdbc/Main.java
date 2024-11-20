package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Apollion", "Kuradov", (byte) 18);
        userService.saveUser("Alex", "Gertainov", (byte) 18);
        userService.saveUser("Oleg", "Cherrny", (byte) 18);
        userService.saveUser("Lizxa", "Barka", (byte) 18);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
