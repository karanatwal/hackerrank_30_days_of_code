package com.kandy.hackerrankpractice.hackerrank

import java.util.*

/*
 https://www.hackerrank.com/challenges/30-recursion/problem
 Karandeep Atwal
 +91-9646874950
*/

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = factorial(n)

    println(result)

    scan.close()
}
