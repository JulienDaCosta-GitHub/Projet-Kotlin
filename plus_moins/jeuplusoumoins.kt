fun main (){
    print("Joueur 1, choisissez le nombre gagnant entre 1 et 1000: ")

    var firstscan = readLine()
    var numbervictory = firstscan.toString()

    jeuplusoumoins(numbervictory)
}

fun jeuplusoumoins(arg1: String) {
    print("Joueur 2, choisissez un nombre entre 1 et 1000: ")

    var scan = readLine()
    var value = scan.toString()

    if (scan != null) {
        return if (value < arg1){
            println("Votre nombre est trop petit.")
            jeuplusoumoins(arg1)
        }
        else if (value > arg1){
            println("Votre nombre est trop grand.")
            jeuplusoumoins(arg1)
        }
        else if (value == arg1){
            println("Félicitations !")
        }
        else {
            println("Game Over !")
        }
    }
}