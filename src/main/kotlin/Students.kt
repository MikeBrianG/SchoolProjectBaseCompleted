import java.util.*

open class Students(
    val name: String,
    val registrationNumber: Int,
    var grade: Int,
    val beforeGrade: Int,
    val grades: DoubleArray = doubleArrayOf(),
    val absenceNumber: Int,
    val password: Int,
) {
    open var gradeTest: Int = 0

    open fun registration(turmaPretendida: Int): Int {
        if (beforeGrade > turmaPretendida && passTest() == "Aprovado") {
            println("Matricula não autorizada para ${name}")
            gradeTest = beforeGrade
            return gradeTest
        } else if (beforeGrade == turmaPretendida && passTest() == "Aprovado") {
            println("Matricula não autorizada para ${name}")
            gradeTest = beforeGrade
            return gradeTest
        } else if (beforeGrade < turmaPretendida && passTest() == "Aprovado") {
            println("Matricula de ${name}  autorizada para a turma ${turmaPretendida}")
            gradeTest = beforeGrade
            return gradeTest
        } else if (turmaPretendida > beforeGrade + 1) {
            println("Registro negado")
            gradeTest = beforeGrade
            return gradeTest

        } else {
            println("Matricula de ${name} autorizada para a turma ${turmaPretendida}")
            gradeTest = beforeGrade
            return gradeTest
        }

    }


    fun avarageGradeTest() {
        val gradesAvgTest = grades
        var sumAvgTest = 0.0

        for (averagegrades in gradesAvgTest) {
            sumAvgTest += averagegrades

        }
        val averageGrades = sumAvgTest / gradesAvgTest.size
        println("Nota média: ${"%.1f".format(averageGrades)}")

    }

    val loginStudentsG1: String = name
    val passwordStudents1: Int = password
    fun studentsLogins(login: String, password: Int) {
        if (loginStudentsG1 == login && passwordStudents1 == password) {
            println("login efetuado com sucesso!")
        } else {
            println("login ou senha incorretas!")
        }
    }

    fun StudentInfo() {


        println("Informações do Aluno:")
        println("Nome: $name")
        println("Número de registro: $registrationNumber")
        println("Turma passada: $beforeGrade")
        println("Turma atual: $grade")
        println("Notas do aluno: ${Arrays.toString(grades)}")
        println("Número de faltas: $absenceNumber")
        avarageGradeTest()
        passTest()
    }


    fun passTest(): String {

        val gradesAvgTest = grades
        var soma = 0.0

        for (averagegrades in gradesAvgTest) {
            soma += averagegrades

        }

        val averageGrades = soma / gradesAvgTest.size

        if (absenceNumber < 31 && averageGrades > 6.0) {
            println("Aluno $name aprovado.")
            return "Aprovado"


        } else {
            println("Aluno $name reprovado")
            return "Reprovado"
        }

    }
}
