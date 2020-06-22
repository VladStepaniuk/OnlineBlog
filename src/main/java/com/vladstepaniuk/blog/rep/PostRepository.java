package com.vladstepaniuk.blog.rep;

import com.vladstepaniuk.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
