class Teacher(
    name: String,
    cpf: String,
    wage: Double,
    password: Int,
): Employees(
    name = name,
    cpf = cpf,
    wage = wage,
) {
    val teacherLogin: String = "$name"
    val passwordTeachers: Int = password

    fun teacherLoginFun(login: String, password: Int) {
        if (teacherLogin == login && passwordTeachers == password) {
            println("login efetuado com sucesso!")
        } else {
            println("login ou senha incorretas!")
        }

    }
}


