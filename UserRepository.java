package com.example.rest.service.my;


import org.springframework.data.repository.CrudRepository;

import com.example.rest.service.my.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, String> {

}
