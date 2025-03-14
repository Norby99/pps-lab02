package u02personal.Test

import org.junit.*
import org.junit.Assert.*

import u02personal.Main.Part2.*

class Part2Test:
    @Test def checkNegString() =
        val f = (x: String) => x == "banana"
        /*val negF = neg(f)
        
        assertFalse(negF("banana"))
        assertTrue(negF("apple"))*/
        
    @Test def checkNegIntEven() =
        val f = (x: Int) => x % 2 == 0
        /*val negF = neg(f)
        
        assertFalse(negF(4))
        assertTrue(negF(7))*/
