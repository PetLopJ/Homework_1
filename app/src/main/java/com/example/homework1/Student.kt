package com.example.homework1

class Student constructor(var name:String, var major:String, var courses:List<courseInfo>) {

    fun totalCredits():Int {
        var total = 0

        for(i in courses) {
            total += 3
        }
        return total
    }
}