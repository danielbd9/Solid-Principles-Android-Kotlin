package com.pt.solidkotlin

// Each class must have a single responsibility.
fun main() {
    val user = User(1, "John")
    val authenticator = UserAuthenticator()
    val repository = UserRepository()

    if (authenticator.authenticate(user)) {
        repository.save(user)
    }
}

// A class responsible for user data
class User(val id: Int, val name: String)

// A class responsible for user authentication
class UserAuthenticator {
    fun authenticate(user: User): Boolean {
        // Authentication logic here
        return user.id == 1 // Dummy check
    }
}

// A class responsible for user database operations
class UserRepository {
    fun save(user: User) {
        // Save user to the database
        println("User ${user.name} saved!")
    }
}
