package com.nelioalves.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.dto.UserDTO;
import com.nelioalves.workshopmongo.repository.UserRepository;
import com.nelioalves.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}

	public User findById(String id) {
		User user = null;
		Optional<User> optional = repository.findById(id);
		if(optional.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado.");
		}else {
			user = optional.get();
		}
		return user;
	}
	
	public User insert(User user) {
		return repository.insert(user);
	}

	public void delete(String id) {
		repository.deleteById(id);
	}
	
	public User fromUserDTO(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
	}
	
	
}
