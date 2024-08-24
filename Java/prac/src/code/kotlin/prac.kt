package code.kotlin

import java.io.BufferedReader


fun main() {
    var temp = Integer.valueOf(readlnOrNull())
    var a = ""

    if (temp == null) {
        print("Wrong INPUT!!")
    } else {

        if (temp >= 70) {
            a = "A"
        } else if (temp >= 50 && temp < 70) {
            a = "B"
        } else if (temp >= 30 && temp < 50) {
            a = "C"
        } else {
            a = "D"
        }

        print(a)
    }


}