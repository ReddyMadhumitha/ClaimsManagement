/**
 * 
 */
package com.hcl.claimsmanagementsystem.repository;

import javax.validation.Valid;

import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.User;

/**
 * @author reddy-madhumitha
 *
 */


public interface UserDao {
    boolean register(@Valid User user);
	boolean login(@Valid Credential Credential);
	}
