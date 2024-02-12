import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine()) // Ler a linha de entrada

    // Lendo a nota ou média do aluno como Double
    val media = st.nextToken().toDouble()

    // Verificando a situação do aluno
    when {
        media < 5 -> println("REP");
        media >= 5 && media < 7 -> println("REC");
        media > 7 -> println("APR")
        else -> println("Média inválida. Favor informar média correta.")
    }
}