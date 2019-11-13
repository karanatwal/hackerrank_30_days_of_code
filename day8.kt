package com.kandy.hackerrankpractice.hackerrank

import java.util.*
import kotlin.collections.HashMap

/*
 https://www.hackerrank.com/challenges/30-dictionaries-and-maps
 Karandeep Atwal
 +91-9646874950
*/

fun main() {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    val myMap = HashMap<String, Int>()
    for (i in 1..count) {
        myMap[scanner.next()] = scanner.nextInt()
    }

    while (scanner.hasNext()) {
        val name = scanner.next()
        if (myMap.containsKey(name))
            println("$name=${myMap[name]}")
        else
            println("Not found")
    }
    scanner.close()
}