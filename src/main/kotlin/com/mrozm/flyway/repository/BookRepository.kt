package com.mrozm.flyway.repository

import com.mrozm.flyway.domain.Book
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: CrudRepository<Book, String>