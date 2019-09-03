package com.example.demo.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.userRepository.findByUsername(username);
		UserDetails userDetails = new UserDetails() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isEnabled() {
				return user.isEnable();
			}
			
			@Override
			public boolean isCredentialsNonExpired() {
				return true;
			}
			
			@Override
			public boolean isAccountNonLocked() {
				return true;
			}
			
			@Override
			public boolean isAccountNonExpired() {
				return true;
			}
			
			@Override
			public String getUsername() {
				return user.getUsername();
			}
			
			@Override
			public String getPassword() {
				return user.getPassword();
			}
			
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				
				Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
				List<Role> roles = user.getRoles();
				for (Role role : roles) {
					GrantedAuthority grantedAuthority = new GrantedAuthority() {
						
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						@Override
						public String getAuthority() {
							return role.getName();
						}
					};
					grantedAuthorities.add(grantedAuthority);
				}
				return grantedAuthorities;
			}
		};
		return userDetails;
	}

}
