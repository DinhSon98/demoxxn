package service;

import model.User;
import repository.LoginRepository;

public class LoginService {

    LoginRepository loginRepository = new LoginRepository();

    User login(String username, String password){
        return  loginRepository.login(username,password);
    }
}
