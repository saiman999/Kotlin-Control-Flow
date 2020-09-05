package WhenExpression

fun main() {
    val anyType: Any = 100L
    when(anyType){
        is Long ->println("the value has a long type")
        is String ->println("the value has a string type")
        else ->println("undefined")
    }
}