fun main() {
    val greeting : String = "Hello kotlin"

    var name = "Ayse"


    println(greeting)
    println(name)

    println("Hosgeldin $name")

    println(greeting.length)

    println(name.uppercase())
    println(name.lowercase())
    name = name.replace("Ay","May")
    println(name)

    println("Hosgeldin $name")

    println("Ilk karakter ${name[0]}")
    println("Son karakter ${name[name.length - 1]}")

    val number : Int = 15
    val age = 30

    println("Toplama ==> ${ number + age}")
    println("Cikarma ==> ${ number - age}")
    println("Carpma ==> ${ number * age}")
    println("Bolme ==> ${ number / age}")
    println("Modunu alma ==> ${ age % 2}")

    val a = 10
    val b = 3

    println("Toplama ==> ${  a + b}")
    println("Cikarma ==> ${  a - b}")
    println("Carpma ==> ${  a * b}")
    println("Bolme ==> ${ a / b}")
    println("Modunu alma ==> ${ a % b}")


    val result = a.toDouble() / b.toDouble()
    val result2 = a / b

    println("Result ===> $result")


    val number2 = 100
    val text = "200"
    val text2 = "abc"

    val convertedString = number2.toString()
    val convertedInt = text.toInt()

    println("Converted String ===> $convertedString")
    println("Converted Int ===> $convertedInt")


    val safeConvert = text.toIntOrNull()
    val safeConvert2 = text2.toIntOrNull() ?: 25
    val safeConvert3 = text2.toIntOrZero()
    val safeConvert4 = text2.toIntOrZero2()

    println("safeConvert  ===> $safeConvert")
    println("safeConvert2  ===> $safeConvert2")
    println("safeConvert3  ===> $safeConvert3")
    println("safeConvert3  ===> $safeConvert4")
}


fun String?.toIntOrZero() = this?.toIntOrNull() ?: 0
fun String?.toIntOrZero2() : Int {
    return this?.toIntOrNull() ?: 0
}