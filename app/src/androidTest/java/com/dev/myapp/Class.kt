package com.dev.myapp

class Motor()

class Contact(val id: Int, var email: String)

fun main () {
    val contact = Contact(1, "mary@gmail.com")


   // prints the value of the property: email
    println(contact.email)

    // update the value of the property: email
    contact.email = "janee@gmail.com"

    // print the new value of the property: email
    println(contact.email)

}
