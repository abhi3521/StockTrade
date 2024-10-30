package Service;

import Entity.User;
import Repository.UserList;

public class UserService {

    UserList   userList;
    public String addBalance(Long userId, double balance, String type) {
        User user = userList.getUserByUserId(userId);
        if(type.equals("Add")) {
            user.setAmount(user.getAmount() + balance);
        } else if(type.equals("purchase")) {
            user.setAmount(user.getAmount() - balance);
        }
        return "Balance updated : " + user.getAmount();
    }
}
