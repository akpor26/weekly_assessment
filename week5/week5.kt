fun main(args: Array<String>) {
    var result: String = removeVowels("My name is Akpor, I am a very hardworking")
    println("$result")
}

fun removeVowels(str: String): String {
    var result: String = ""
    var c: Char
    for (x in 0 until str.length) {
        c = str[x]
        if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
            result += c
        }
    }
    return result
}