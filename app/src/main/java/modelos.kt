// Molde de um estado: guarda só o que vamos usar do JSON
data class Estado(
    val id: Int,
    val sigla: String,
    val nome: String
)
// Molde de uma cidade (município)
data class Cidade(
    val id: Int,
    val nome: String
)
