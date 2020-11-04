/**
 * 
 */
package com.hcl.claimsmanagementsystem.repository;

import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.User;

/**
 * @author reddy-madhumitha
 *
 */
public interface UserDao {
	boolean register(User user);
    boolean login(Credential credential);
}


