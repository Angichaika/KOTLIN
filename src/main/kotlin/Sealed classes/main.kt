package Esercizio1.Esercizio_2
sealed class User {
    abstract val id: String

    data class EmailUser(
        override val id: String,
        val email: String,
        val password: String
    ) : User()

    data class FacebookUser(
        override val id: String,
        val facebookId: String
    ) : User()

    data class GoogleUser(
        override val id: String,
        val googleId: String,
        val email: String
    ) : User()

    fun details(): String {
        return when (this) {
            is EmailUser -> "EmailUser (ID: $id, Email: $email)"
            is FacebookUser -> "FacebookUser (ID: $id, Facebook ID: $facebookId)"
            is GoogleUser-> "GoogleUser (ID: $id, Google ID: $googleId, Email: $email)"
        }
    }
}

fun main() {
    val emailUser = User.EmailUser("649", "angi.gmail.com", "password2")
    val facebookUser = User.FacebookUser("053", "facebook@gmail.com")
    val googleUser = User.GoogleUser("9", "google9", "FRancesco@gmail.com")

    println(emailUser.details())
    println(facebookUser.details())
    println(googleUser.details())
}