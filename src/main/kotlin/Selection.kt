
fun selection(n: Int) {
    var isSelected = false

    while (!isSelected) {
        println("Choose the type of function you require (FAT/FIB)")
        val func = readln().uppercase()

        if (func == "FAT" || func == "FATTORIALE") {
            factorial(n)
            isSelected = !isSelected
            break

        }
        if (func == "FIB" || func == "FIBONACCI"){
            fibonacci(n)
            isSelected = !isSelected
            break
        } else println("please retry")


    }
}