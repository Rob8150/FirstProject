fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main(args: Array<String>) {

    println("Whats your name?")
    val name = readln()
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
    println("Hello, $name!")

    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")                 // 6
    printMessageWithPrefix("Hello")                             // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")          // 8
    println(sum(1, 2))                                             // 9
    println(multiply(2, 4))
}
