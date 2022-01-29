package com.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.userDao;

@Service
@Transactional
public class userService {
	
	@Autowired
	private userDao ud;
	
	

}