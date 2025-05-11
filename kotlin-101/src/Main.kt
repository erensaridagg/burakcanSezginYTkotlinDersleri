//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {

    println("Hello Wolrd!")
    val welcomeMessage = "Welcome to Kotlin"
    println(welcomeMessage)

    val pi = 3.14 //pi degeri sabittir
    println(pi)

    var counter = 10
    println(counter)
    counter = 15
    println("New value --> $counter")

    var appName = "Kotlin101"
    println(appName)
    appName = "Kotlin202"
    println(appName)
}

/**
 * val (Immutable - Degistirilemez Degiskenler)
 *
 * Deger atandiktan sonra degistirelemez.
 * Javadaki final degisken gibi calisir.
 * Bellek yonetimi acisindan daha guvenlidir cunku degistirilemeyen veriler gereksiz degisikliklerden korunur.
 * Ozellikle sabit degerler(Constants) veya degismeye gerekmeyen veriler icin idealdir.
 *
 * //println("Hello Wolrd!")
 *
 *     // val (immutable - degistirilemez degisken)
 *
 *     val welcomeMessage  = "Welcome to Kotlin"
 *     println(welcomeMessage)
 *
 *
 *
 *     val pi = 3.14 //pi degeri sabittir
 *     println(pi)
 *
 *
 */

/**
 * var (Mutable - Degistirilebilir Degiskenler)
 *
 * Degeri degisebilir. Bir kez kullandiktan sonra farkli degerler atanabilir.
 * Kullanim acisindan daha esnek olsa da, gereksiz var kulannimlari kodun karmasikligini arttirabilir.
 * Daha fazla bellke kullanilabilir, degiskenlerin degeri calisma zamaninda guncellenebilir.
 *
 * var counter = 10
 *  *
 *  *     println(counter)
 *  *
 *  *     counter = 15
 *   println("New value --> $counter")
 *  var appName = "Kotlin101"
 *  *     println(appName)
 *  *     appName = "Kotlin202"
 *  *     println(appName)
 * */