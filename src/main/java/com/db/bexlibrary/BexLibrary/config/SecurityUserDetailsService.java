package com.db.bexlibrary.BexLibrary.config;

import com.db.bexlibrary.BexLibrary.entities.User;
import com.db.bexlibrary.BexLibrary.repositories.BookRepository;
import com.db.bexlibrary.BexLibrary.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class SecurityUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(s);
        if (user != null) {
            return new SecurityUserDetails(user);
        }
        throw new UsernameNotFoundException("Account with username " + s + " not found");
    }
}
