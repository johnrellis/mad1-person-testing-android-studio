package com.setu.testingexample.model

class Team {
    private val members = hashSetOf<Person>()

    val numberOfMembers: Int
        get() {
            return members.size
        }

    fun addMember(person: Person): Boolean {
        return members.add(person)
    }

    fun removeMember(person: Person): Boolean {
        return members.remove(person)
    }

    fun retrieveMembers(): Set<Person>{
        return (members.map { it.copy() }).toHashSet()
    }
}