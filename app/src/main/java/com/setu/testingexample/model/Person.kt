package com.setu.testingexample.model

data class Person (val pps: String, val name: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (pps != other.pps) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = pps.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }
}