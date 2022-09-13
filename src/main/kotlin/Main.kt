import java.util.Scanner
fun main () {
    println("Bem vindo ao sistema escolar")
    println("se você for professor digite 1\n se você for aluno digite 2")
    val scanner = Scanner(System.`in`)
//    val num1 = scanner.nextInt()
//    when (num1){
//       1 -> initTeacherSystem()
//        2 ->
//    }
//    else println("não foi")

    studentsListGradeOne[0].registration(turmaPretendida = 3)
    val nomelogin = scanner.next()
    val senhalogin = scanner.nextInt()

    if (studentsListGradeOne.any { it.name == nomelogin } && studentsListGradeOne.any { it.password == senhalogin }) {
        println("login existe")
    } else "login não existe"

    fun initTeacherSystem() {
        println("acessando o sistema no modo professor")
    }
}




















    




