import java.util.*

/*

Time Complexity - O(NlogN)
Auxiliary Space - O(N)

Here we can solve without the usage of stack which will even more optimize the code.

 */

fun main() {

    var from = arrayOf(1800, 900, 940, 950, 1100, 1500)
    var to = arrayOf(910, 1200, 1120, 1130, 1900, 2000)


    var sortedIndex = findSortedIndex(from)
    var stack = Stack<Int>()
    var count: Int = 1
    stack.push(sortedIndex[0])
    var res = 0

    for (i in 1..from.size - 1) {

        res = Math.max(count, res)

        if (from[stack.peek()] <= from[sortedIndex[i]] && to[stack.peek()] >= to[sortedIndex[i]]) {
            count++
        } else {
            stack.push(i)
            count = 1
        }

    }

    println(res)


}


fun findSortedIndex(arr: Array<Int>): Array<Int> {

    var index: Array<Int> = Array(arr.size, { i -> i })
    mergesort(arr, index, 0, arr.size)
    return index
}

fun mergesort(arr: Array<Int>, index: Array<Int>, start: Int, end: Int) {

    if (end - start == 1) return

    var mid: Int = (start + end) / 2

    mergesort(arr, index, start, mid)
    mergesort(arr, index, mid, end)
    merge(arr, index, start, mid, end)
}

fun merge(arr: Array<Int>, index: Array<Int>, start: Int, mid: Int, end: Int) {

    var mix: Array<Int> = Array(end - start, { 0 })
    var i: Int = start
    var j: Int = mid
    var k = 0

    while (i < mid && j < end) {

        if (arr[index[i]] < arr[index[j]]) mix[k++] = index[i++]
        else mix[k++] = index[j++]

    }

    while (i < mid) mix[k++] = index[i++]
    while (j < end) mix[k++] = index[j++]

    for (l in 0 until mix.size) index[start + l] = mix[l]


}