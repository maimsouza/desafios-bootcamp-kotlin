class User(val id: Int, val name: String)

class UserManager private constructor() {
    private val users = mutableListOf<User>()

    companion object {
        private val instance: UserManager by lazy { UserManager() }

        @JvmName("getUniqueInstance")
        fun getInstance(): UserManager {
            return instance
        }
    }

    fun addUser(name: String) {
        val newUser = User(users.size + 1, name)
        users.add(newUser)
    }

    fun listUsers() {
        if (users.isEmpty()) {
            println("Nenhum usuário cadastrado.")
        } else {
            users.forEach { println("${it.id} - ${it.name}") }
        }
    }

    fun clearUsers() {
        users.clear()
    }
}

fun main() {
    val userManager = UserManager.getInstance()

    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        userManager.addUser(name)
    }

    userManager.listUsers()
    userManager.clearUsers()
}
