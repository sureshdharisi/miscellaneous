package com.home.expences.user.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.home.expences.user.documents.UserDetails;

@Repository
public interface UserRepositories extends MongoRepository<UserDetails, String> {

}
