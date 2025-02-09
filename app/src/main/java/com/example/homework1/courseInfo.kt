package com.example.homework1

import androidx.compose.runtime.Composable

data class courseInfo(var courseName:String, var startTime:String, var endTime:String, var days:String, var credit:Int) {

    var course = courseName
    var start = startTime
    var end = endTime


}
