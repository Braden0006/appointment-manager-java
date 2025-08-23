package org.example.appointmentmanager.repository;

import org.example.appointmentmanager.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends MongoRepository<User, String> {
}
