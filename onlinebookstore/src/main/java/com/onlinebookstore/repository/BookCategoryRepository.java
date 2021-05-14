package com.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinebookstore.dao.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
