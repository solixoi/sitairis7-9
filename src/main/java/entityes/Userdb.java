package entityes;

import java.util.ArrayList;
import java.util.List;

public class Userdb {
    private List<User> users;

    public Userdb(){
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public String getUsers() {
        StringBuilder sb = new StringBuilder();
        for(User user: users){
            sb.append(user.toString());
        }
        return sb.toString();
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "\nUsers: " + getUsers();
    }
}
