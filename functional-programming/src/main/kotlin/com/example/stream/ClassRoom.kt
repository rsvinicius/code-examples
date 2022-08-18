package com.example.stream

class ClassRoom {
    fun getClassRoom(): List<Student> {
        val classRoom = ArrayList<Student>()

        classRoom.add(Student("Jon",19, 7.8))
        classRoom.add(Student("Yulia",21, 9.2))
        classRoom.add(Student("Lucas",23, 6.3))
        classRoom.add(Student("Lara", 20, 7.0))
        classRoom.add(Student("Harry", 22, 8.4))

        return classRoom
    }
}