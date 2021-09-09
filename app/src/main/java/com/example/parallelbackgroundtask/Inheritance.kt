package com.example.parallelbackgroundtask

//Base Class
open class Inheritance {
    //use open keyword to allow child class to override it

    open val courseId: Int = 0

    open fun courseName(){
        println("Course Name Kotlin")
    }
}

//Derived Class
class AndroidPro : Inheritance(){
    //use the override keyword to override the variable
    override val courseId: Int = 1

    //use the override keyword to override the function
    override fun courseName() {
        println("Android for professional")
    }
}

