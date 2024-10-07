package com.setu.testingexample.model

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class PersonTests {

    @Test
    fun testEquals() {
        val luke = Person(pps = "1234F", name = "Luke")
        val luuke = Person(pps = "1234F", name = "Luuke")
        assertEquals(luuke, luke, "person is not equal")
    }

    @Test
    fun testHashCode() {
        val people = setOf<Person>(
            Person(pps = "1234F", name = "Luke"),
            Person(pps = "1234F", name = "Luuke")
        )
        assertEquals(1, people.size)
    }

    @Test
    fun getPps() {
    }

    @Test
    fun getName() {
    }

    @Test
    fun copy() {
    }
}