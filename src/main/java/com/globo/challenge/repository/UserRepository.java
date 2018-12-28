package com.globo.challenge.repository;

import com.globo.challenge.models.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<AppUser, String> {

    AppUser findByUsername(String username);

}
