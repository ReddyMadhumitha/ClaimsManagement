package com.hcl.claimsmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.User;
import com.hcl.claimsmanagementsystem.repository.UserDao;

/**
 * @author reddy-madhumitha
 *
 */
@Service 
public class UserServiceImpl implements UserService {
	@Autowired
    UserDao userDao;
    public boolean register(User usr) {
        userDao.register(usr);
        return true;
    }
    
    public boolean login(Credential credential) {
        userDao.login(credential);
        return true;
    }
}

