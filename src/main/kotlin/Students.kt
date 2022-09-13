open class Students(
    val name: String,
    val registration: Int,
    var grade: Int = registration,
    val beforeGrade: Int,
    val grades: DoubleArray = doubleArrayOf(),
    val absenceNumber: Int,
    val password: Int,
)
{
    var gradeTest: Int = 0

    open fun registration(turmaPretendida: Int): Int {
        if (beforeGrade > turmaPretendida && passTest() == "Aprovado") {
            println("Matricula não autorizada para ${name}")
            gradeTest = beforeGrade
            return gradeTest
        }
        else if (beforeGrade == turmaPretendida && passTest() == "Aprovado"){
            println("Matricula não autorizada para ${name}")
            gradeTest = beforeGrade
            return gradeTest
        }
        else if( beforeGrade < turmaPretendida && passTest() == "Aprovado" && turmaPretendida == beforeGrade){
            println("Matricula de ${name}  autorizada para a turma ${turmaPretendida}")
            gradeTest = beforeGrade
            return gradeTest
        }
        else if(turmaPretendida > beforeGrade+1 ){
            println("Registro negado")
            gradeTest = beforeGrade
            return gradeTest

        }
        else{
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


    fun passTest(): String {

        val gradesAvgTest = grades
        var soma = 0.0

        for (averagegrades in gradesAvgTest) {
            soma += averagegrades

        }

        val averageGrades = soma / gradesAvgTest.size

        if (absenceNumber < 31 && averageGrades > 6.0) {
            return "Aprovado"

        } else {
            return  "Reprovado"
        }


        val loginStudentsG1: String = "$name"
        val passwordStudents1: Int = password

        fun studentsLogin(login: String, password: Int) {
            if (loginStudentsG1 == login && passwordStudents1 == password) {
                println("login efetuado com sucesso!")
            } else {
                println("login ou senha incorretas!")
            }

        }

        fun StudentInfo() {
            println("Informações do Aluno:")
            println("Nome: $name")
            println("Número de registro: $registration")
            println("Turma passada: $beforeGrade")
            println("Turma atual: $grade")
            println("Notas do aluno: $grades")
            println("Número de faltas: $absenceNumber")
            println("Nota média:  ")
            avarageGradeTest()
            passTest()
        }
    }
}
