package com.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.onlinebookstore.dao.BookCategory;
@RepositoryRestResource(collectionResourceRel="bookcategory",path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
