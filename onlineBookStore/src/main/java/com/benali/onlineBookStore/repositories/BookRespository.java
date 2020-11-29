package com.benali.onlineBookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benali.onlineBookStore.entities.Book;

public interface BookRespository extends JpaRepository<Book, Long> {

}
