package WhenExpression

fun main() {
    val value = 8
    val StringOfValue = when (value){
        6 ->{
            println("SIX")
            "value is 6"
        }
        7 ->{
            println("SEVEN")
            "value is 7"
        }
        8 ->{
            println("EIGHT")
            "value is 8"
        }
        else ->{
            println("UNDEFINED")
            "value cant be reached"
        }
    }
    println(StringOfValue)
}