fun week7(num: Int){
    var num2: Int = num
    val reversedNum = ArrayList<Int>()
    do {
        reversedNum.add(num2 % 10)
        num2 /= 10
    } while (num2 > 0)
    println("Reversed Number is: $reversedNum")

}



fun main(args: Array<String>) {
    week7(348597)
    week7(258)
}