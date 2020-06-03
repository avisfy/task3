package task3.dao;

import org.springframework.stereotype.Repository;
import task3.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UsersDAOImpl implements UsersDAO {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, User> users = new HashMap<>();

    static {
        User user1 = new User("uname", "usurname", "umail@mail.com", "2001-02-02");
        user1.setId(AUTO_ID.getAndIncrement());
        users.put(user1.getId(), user1);
        User user2 = new User("uname1", "usurname1", "umail1@mail.com", "2002-02-02");
        user2.setId(AUTO_ID.getAndIncrement());
        users.put(user2.getId(), user2);
    }
    @Override
    public List<User> allUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void add(User user) {
        user.setId(AUTO_ID.getAndIncrement());
        users.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }

    @Override
    public void edit(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }
}
