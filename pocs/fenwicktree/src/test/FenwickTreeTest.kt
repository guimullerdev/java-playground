package test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import util.FenwickTree

class FenwickTreeTest {

    @Test
    fun emptyTree() {
        val tree = FenwickTree(5)
        assertEquals(0, tree.query(1))
        assertEquals(0, tree.query(5))
    }

    @Test
    fun singleUpdate() {
        val tree = FenwickTree(5)
        tree.update(1, 5)
        assertEquals(5, tree.query(1))
    }

    @Test
    fun prefixSum() {
        val tree = FenwickTree(5)
        tree.update(1, 1)
        tree.update(2, 2)
        tree.update(3, 3)
        tree.update(4, 4)
        tree.update(5, 5)

        assertEquals(1, tree.query(1))
        assertEquals(3, tree.query(2))
        assertEquals(6, tree.query(3))
        assertEquals(10, tree.query(4))
        assertEquals(15, tree.query(5))
    }

    @Test
    fun rangeQuery() {
        val tree = FenwickTree(5)
        tree.update(1, 1)
        tree.update(2, 2)
        tree.update(3, 3)
        tree.update(4, 4)
        tree.update(5, 5)

        // sum from index 2 to 4 = 2 + 3 + 4 = 9
        val rangeSum = tree.query(4) - tree.query(1)
        assertEquals(9, rangeSum)
    }

    @Test
    fun multipleUpdatesToSameIndex() {
        val tree = FenwickTree(5)
        tree.update(3, 10)
        tree.update(3, 5)
        assertEquals(15, tree.query(3))
    }

    @Test
    fun negativeDelta() {
        val tree = FenwickTree(5)
        tree.update(2, 10)
        tree.update(2, -3)
        assertEquals(7, tree.query(2))
    }

    @Test
    fun fullTree() {
        val n = 8
        val tree = FenwickTree(n)
        for (i in 1..n) tree.update(i, i)
        assertEquals(36, tree.query(n)) // 1+2+...+8 = 36
    }

    @Test
    fun boundaryIndices() {
        val tree = FenwickTree(10)
        tree.update(1, 7)
        tree.update(10, 3)
        assertEquals(7, tree.query(1))
        assertEquals(10, tree.query(10))
    }
}
