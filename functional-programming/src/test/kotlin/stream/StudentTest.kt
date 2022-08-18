package stream

import com.example.stream.ClassRoom
import com.example.stream.Student
import com.example.stream.StudentUtils
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode

@Execution(ExecutionMode.CONCURRENT)
class StudentTest {
    private lateinit var students: List<Student>

    private lateinit var studentUtils: StudentUtils

    @BeforeEach
    fun setup() {
        students = ClassRoom().getClassRoom()
        studentUtils = StudentUtils()
    }

    @Test
    @DisplayName("Show students with name starting with letter L")
    fun testTwoStudentsStartWithL() {
        Thread.sleep(200)
        val actual = studentUtils.getStudentsBeginningWithL(students)
        assertThat(actual).hasSize(2)
        assertThat(actual).extracting("name")
            .containsExactly("Lucas", "Lara")
    }

    @Test
    @DisplayName("Show students older than twenty years old")
    fun testThreeStudentsOlderThanTwenty() {
        Thread.sleep(4000)
        val actual = studentUtils.getStudentsOlderThanTwenty(students)
        assertThat(actual).hasSize(3)
        assertThat(actual).extracting("name")
            .containsExactly("Yulia", "Lucas", "Harry")
    }

    @Test
    @DisplayName("Show students with grade lower than eighty")
    fun testThreeStudentsWithGradeLowerThanEighty() {
        Thread.sleep(2000)
        val actual = studentUtils.getStudentsWithGradesLowerThanEighty(students)
        assertThat(actual).hasSize(3)
        assertThat(actual).extracting("name")
            .containsExactly("Jon", "Lucas", "Lara")
    }
}