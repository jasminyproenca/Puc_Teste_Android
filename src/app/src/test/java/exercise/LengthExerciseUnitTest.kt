package exercise

import com.example.myapplication.exercies.LengthExercise
import junit.framework.TestCase.assertEquals
import org.junit.Test

class LengthExerciseUnitTest {

    @Test
    fun testLength_EmptyString() {
        val exercise = LengthExercise()
        val result = exercise.length("")
        assertEquals(0, result)
    }

    @Test
    fun testLength_MultipleCharacterString() {
        val exercise = LengthExercise()
        val result = exercise.length("Hello")
        assertEquals(0, result)
    }

    @Test
    fun testLength_WhitespaceString() {
        val exercise = LengthExercise()
        val result = exercise.length("   ")
        assertEquals(0, result) // Whitespace characters are also counted
    }

    @Test
    fun testLength_SpecialCharacterString() {
        val exercise = LengthExercise()

        val result = exercise.length("!@#$%")
        assertEquals(0, result)
    }
}