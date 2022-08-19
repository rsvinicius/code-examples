package com.example.stream

class StudentUtils {
    fun getStudentsBeginningWithL(classroom: List<Student>): List<Student> {
        return classroom.filter { student -> student.name.startsWith("L") }
    }

    fun getStudentsOlderThanTwenty(classroom: List<Student>): List<Student> {
        return classroom.filter { student -> student.age > 20 }
    }

    fun getStudentsWithGradesLowerThanEighty(classroom: List<Student>): List<Student> {
        return classroom.filter { student -> student.grades < 8.0 }
    }
}