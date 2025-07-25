package designpatterns._02_structural_patterns._06_adapter;

import designpatterns._02_structural_patterns._06_adapter.security.LoginHandler;
import designpatterns._02_structural_patterns._06_adapter.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
