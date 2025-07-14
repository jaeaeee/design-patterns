package designpatterns._02_structural_patterns._06_adapter;

import designpatterns._02_structural_patterns._06_adapter.security.UserDetails;
import designpatterns._02_structural_patterns._06_adapter.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
