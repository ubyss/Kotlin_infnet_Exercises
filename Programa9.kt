import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(){
    val novaData = Data()
    novaData.calculateDaysOfMounth()
    novaData.checkLeapYear()
    novaData.calculateBetweenDays()
}


class Data {
    val day = 13
    val month = 2
    val year = 2022

    fun calculateDaysOfMounth(){
        if(this.month == 2){
            println("28 DIAS")
        } else if (this.month % 2 == 0){
            println("30 DIAS")
        } else {
            println("31 DIAS")
        }
    }

    fun checkLeapYear(){
        if (this.year % 100 != 0 && this.year % 4 == 0 || this.year % 400 == 0){
            println("É um ano bissexto")
        } else {
            println("Não é bissexto")
        }
    }

    fun calculateBetweenDays(){
        val end = LocalDate.of(this.year, this.month, this.day)
        val start = LocalDate.of(this.year, 1, 1)

        val days = ChronoUnit.DAYS.between(start, end)

        println("Start: $start")
        println("End:   $end")
        println("Days:  $days")
    }
}


