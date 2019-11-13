package com.kandy.hackerrankpractice.hackerrank

import java.util.*

/*
 https://www.hackerrank.com/challenges/30-binary-numbers/problem
 Karandeep Atwal
 +91-9646874950
*/

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n = scan.nextLine().trim().toInt()

    var oneCount = 0
    var maxOne = 0
    while (n > 0) {
        if (n % 2 == 1) {
            oneCount++
            if (maxOne < oneCount) maxOne = oneCount
        } else oneCount = 0
        n /= 2
    }

    println(maxOne)

    scan.close()
}
