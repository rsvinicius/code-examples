package com.example.stream

import java.util.stream.Collectors

class StudentUtils {
    fun getStudentsBeginningWithL(classroom: List<Student>) : List<Student> {
        return classroom.stream()
            .filter { student -> student.name.startsWith("L") }
            .collect(Collectors.toList())
    }

    fun getStudentsOlderThanTwenty(classroom: List<Student>) : List<Student> {
        return classroom.stream()
            .filter { student -> student.age > 20 }
            .collect(Collectors.toList())
    }

    fun getStudentsWithGradesLowerThanEighty(classroom: List<Student>) : List<Student> {
        return classroom.stream()
            .filter { student -> student.grades < 8.0 }
            .collect(Collectors.toList())
    }
}