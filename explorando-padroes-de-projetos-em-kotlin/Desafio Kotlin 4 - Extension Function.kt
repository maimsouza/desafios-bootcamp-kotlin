fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""

    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    // Atribuir o caractere de sublinhado a uma variável
    val separador = "_"

    println("Slug gerado para o livro:")
    println("${slugTitulo}${separador}${slugAutor}")
}

fun String.generateSlug(): String {
    val slug = this.toLowerCase()
        .replace(Regex("\\s+"), "-")  // Substitui espaços por traços
        .replace(Regex("[^a-z0-9-]"), "")  // Remove caracteres especiais
    return slug
}
