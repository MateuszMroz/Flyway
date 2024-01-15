package com.mrozm.flyway.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "books")
data class Book(
        @Id
        val isbn: String,
        val title: String
)