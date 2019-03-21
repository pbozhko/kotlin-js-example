package com.example

external fun require(module: String): dynamic

data class User(
    var name: String,
    var age: Int
)

fun getUsers(): Array<User> {
    return arrayOf(
        User("Alice", 22),
        User("Bob", 26)
    );
}

fun main() {

    val express = require("express")

    val app = express()

    app.get("/") { _, res ->
        res.send(getUsers())
    }

    app.listen(3000) {
        println("Listening on port 3000")
    }
}
