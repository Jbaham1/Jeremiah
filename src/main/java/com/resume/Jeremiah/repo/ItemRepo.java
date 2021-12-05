package com.resume.Jeremiah.repo;

import com.resume.Jeremiah.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item, Long>{
    List<AbstractReadWriteAccess.Item> findByTitle(String titleToSearchFor);

    @Query("from Item post where post.description like %:term%")
    List<Item> searchByBodyLike(@Param("term") String term);

    List<Object> findPostsByTitle(@Param("term") String term);
}
