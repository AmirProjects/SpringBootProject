package org.openhouse.backendexercise.repository;

import org.openhouse.backendexercise.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepo extends PagingAndSortingRepository<User, Long> {
    List<User> findAll();

}
