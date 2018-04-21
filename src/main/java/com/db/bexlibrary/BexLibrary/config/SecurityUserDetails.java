package com.db.bexlibrary.BexLibrary.config;

import com.db.bexlibrary.BexLibrary.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SecurityUserDetails implements UserDetails {

    private User user;
    private Set<GrantedAuthority> authoritySet = new HashSet<>();

    public SecurityUserDetails(User user) {
        this.user = user;
        if (user.isAdmin()) {
            authoritySet.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            authoritySet.add(new SimpleGrantedAuthority("ROLE_USER"));
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authoritySet;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
