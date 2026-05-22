package util

class FenwickTree(val n: Int) {
    private val tree = IntArray(n + 1);

    private fun lsb(i: Int) = i and (-i);

    fun update(i: Int, delta: Int) {
        var idx = i;
        while (idx <= n) {
            tree[idx] += delta;
            idx += lsb(idx);
        }
    }
    //validar se tem como fazer a query so com os numeros impares
    fun query(i: Int): Int {
        var sum = 0;
        var idx = i;
        while (idx > 0) {
            sum += tree[idx];
            idx -= lsb(idx);
        }
        return sum;
    }
}