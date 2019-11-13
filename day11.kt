package com.kandy.hackerrankpractice.hackerrank

import java.util.*

/*
 https://www.hackerrank.com/challenges/30-2d-arrays/problem
 Karandeep Atwal
 +91-9646874950
*/

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val my2dArray = Array(6) { IntArray(6) }
    for (i in 0..5) {
        for (j in 0..5) {
            my2dArray[i][j] = scan.nextInt()
        }
    }
    val glassHourCounts = (6 - (3 - 1))
    var maxSum = -100
    var currentSum = 0
    for (or in 0 until glassHourCounts) {
        for (oc in 0 until glassHourCounts) {
            val my3x3Array = Array(3) { IntArray(3) }
            for (r in 0 until 3) {
                for (c in 0 until 3) {
                    my3x3Array[r][c] = my2dArray[r + or][c + oc]
                }
            }
            my3x3Array.forEachIndexed { rowIndex, columnArray ->
                columnArray.forEachIndexed { columnIndex, value ->
                    if (!(columnIndex == 0 || columnIndex == 2) || rowIndex != 1) currentSum += value
                }
            }
            if (currentSum > maxSum) maxSum = currentSum
            currentSum = 0
        }
    }
    print("$maxSum")
    scan.close()
}