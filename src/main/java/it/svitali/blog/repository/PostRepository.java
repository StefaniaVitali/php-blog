package it.svitali.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.svitali.blog.model.Post;

public interface PostRepository extends JpaRepository <Post, Integer>{

}
