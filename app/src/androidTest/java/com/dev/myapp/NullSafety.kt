package com.dev.myapp

fun nullSafety(){
    var neverNull: String = "This can't be null"

    var nullable: String? = "You can keep a null here"
    // this is OK
    nullable = null

    // Check for null in conditions
    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // Safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

    // noNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) //18
}

fun main(){
    nullSafety()
}