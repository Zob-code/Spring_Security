package com.zobcode.springsecurity.service;

import com.zobcode.springsecurity.dto.UserDto;
import com.zobcode.springsecurity.model.User;

public interface UserService {
	
	User save (UserDto userDto);
	

}