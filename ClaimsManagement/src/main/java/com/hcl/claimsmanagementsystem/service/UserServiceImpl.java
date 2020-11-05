package com.hcl.claimsmanagementsystem.service;

import javax.validation.Valid;

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
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
   
	@Override
	public boolean registerUser(@Valid User user) {
		// TODO Auto-generated method stub
		 if(userDao.registerUser(user)) {
	        	return true;
	        }
		return false;
	}


	

	@Override
	public boolean loginUser(@Valid Credential userCredential) {
		if(userDao.loginUser(userCredential)) {
        	return true;
        }
		return false;
	}
}

	
    
