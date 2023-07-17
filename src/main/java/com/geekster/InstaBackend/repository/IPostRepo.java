package com.geekster.InstaBackend.repository;

import com.geekster.InstaBackend.model.Post;
import com.geekster.InstaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPostRepo extends JpaRepository<Post,Integer> {
    List<Post> findByPostOwner(User user);
//    List<Post> findFirstByUser(User user);

//    List<Post> findFirstByUser(User user);
}
