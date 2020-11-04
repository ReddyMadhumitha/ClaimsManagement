/**
 * 
 */
package com.hcl.claimsmanagementsystem.service;

import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.User;

/**
 * @author reddy-madhumitha
 *
 */
public interface UserService {
	boolean register(User user);
    boolean login(Credential credential);

}
