fun choose(): Int? {
    var correctChoose = false


    while(!correctChoose){

        try {
            println("Insert the number you want to operate")
            val n = readln().toInt()
            correctChoose = !correctChoose
            return n
        } catch (e: NumberFormatException){
            println("please retry")
        }
    }
    return null
}