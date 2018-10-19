package com.thssh.kotlin

fun main(args: Array<String>) {

    println(strLen(null))
}

fun strLen(str: String?): Int{
    return str?.length?:-1
}


data class Person(val str: String){

}