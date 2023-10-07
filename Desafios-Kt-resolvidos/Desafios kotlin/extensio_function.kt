// Gerando slugs de livros

fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""
    
    // Aqui usamos a Extension Function "generateSlug()" nas Strings de Entrada.
    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()
    
    println("Slug gerado para o livro:")
    println("${slugTitulo}_$slugAutor")
}

fun String.generateSlug(): String {
    // Substitui espaços por hífens, converte para minúsculas e remove caracteres especiais
    val slug = this.trim().replace(" ", "-").toLowerCase().replace(Regex("[^a-zA-Z0-9-]"), "")
    return slug
}