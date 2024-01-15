package com.mrozm.flyway

import com.mrozm.flyway.repository.BookRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlywayApplication(private val repository: BookRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        repository.findAll().forEach {
            print(it)
        }
    }

}

fun main(args: Array<String>) {
    runApplication<FlywayApplication>(*args)
}
