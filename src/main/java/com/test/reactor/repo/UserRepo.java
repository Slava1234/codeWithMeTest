package com.test.reactor.repo;

import com.test.reactor.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepo extends ReactiveCrudRepository<User, Long> {
}
