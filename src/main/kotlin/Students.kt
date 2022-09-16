import java.util.*

open class Students(
    val name: String,
    val registrationNumber: Int,
    var grade: Int,
    val beforeGrade: Int,
    val gradesList: DoubleArray = doubleArrayOf(),
    val absenceNumber: Int,
    val password: Int,
) {

    open var gradeTest: Int = 0
    open fun registration(intendedClass: Int): Int {
        if (beforeGrade > intendedClass && passTest() == StudentState.APROVADO) {
            unauthorizedEnrollmentPrintln()
            gradeTest = beforeGrade
            return gradeTest
        } else if (beforeGrade == intendedClass && passTest() == StudentState.APROVADO) {
            unauthorizedEnrollmentPrintln()
            gradeTest = beforeGrade
            return gradeTest
        } else if (beforeGrade < intendedClass && passTest() == StudentState.APROVADO) {
            println("Matricula de ${name} autorizada para a turma ${intendedClass}")
            gradeTest = beforeGrade
            return gradeTest
        } else if (intendedClass > beforeGrade + 1) {
            unauthorizedEnrollmentPrintln()
            gradeTest = beforeGrade
            return gradeTest
        } else {
            println("Matricula de ${name} autorizada para a turma ${intendedClass}")
            gradeTest = beforeGrade
            return gradeTest
        }
    }
    private fun averageGradeTest() {
        val gradesAvgTest = gradesList
        var sumAvgTest = 0.0

        for (averagegrades in gradesAvgTest) {
            sumAvgTest += averagegrades
        }
        val averageGrades = sumAvgTest / gradesAvgTest.size
        println("Nota média: ${"%.1f".format(averageGrades)}")
    }

    val loginStudentsG1: String = name
    val passwordStudents1: Int = password
    fun studentLogin(login: String, password: Int) {
        if (loginStudentsG1 == login && passwordStudents1 == password) {
            println("login efetuado com sucesso!")
        } else {
            println("login ou senha incorretas!")
        }
    }
    fun studentInfo() {
        println("Informações do Aluno:")
        println("Nome: $name")
        println("Número de registro: $registrationNumber")
        println("Turma passada: $beforeGrade")
        println("Turma atual: $grade")
        println("Notas do aluno: ${Arrays.toString(gradesList)}")
        println("Número de faltas: $absenceNumber")
        averageGradeTest()
        passTest()
    }
    private fun passTest(): StudentState {
        val gradesAvgTest = gradesList
        var sum = 0.0

        for (averagegrades in gradesAvgTest) {
            sum += averagegrades
        }

        val averageGrades = sum / gradesAvgTest.size

        return if (absenceNumber < 31 && averageGrades > 6.0) {
            println("Aluno $name aprovado.")
            StudentState.APROVADO
        } else {
            println("Aluno $name reprovado")
            StudentState.REPROVADO
        }
    }
    private fun unauthorizedEnrollmentPrintln() {
        println("Matricula não autorizada para ${name}")
    }
}
enum class StudentState{
    APROVADO,
    REPROVADO
}
