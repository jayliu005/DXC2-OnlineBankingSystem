package com.dxc.dxc2.auth;

public class UsernameAlreadyExistsException extends RuntimeException {

	public UsernameAlreadyExistsException(String userName) {
		super("User Name '%s' has been used".formatted(userName));
	}
}
