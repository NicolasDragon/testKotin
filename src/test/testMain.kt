package test

import main.Main
import org.junit.Test
import kotlin.test.assertEquals

class testMain {


    @Test
    fun testCompute() {
        val result =  Main().compute(5, 6);
        assertEquals(30, result);
    }

    @Test
    fun testStringConcatenation() {
        val result =  Main().concatenate("aa", "bb");
        assertEquals("aabb", result);
    }

    @Test
    fun testInferenceTypeWithInheritence(){
        val Parent=Main().getSon();


    }
}