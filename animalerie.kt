fun main (){
    var chien = Chien()
    var chat = Chat()
    var perroquet = Perroquet()
    var animalerie = Animalerie()


    chien.quiSuisJe()
    chien.parler()

    chat.quiSuisJe()
    chat.parler()

    perroquet.quiSuisJe()
    perroquet.parler()

    animalerie.affiche()

    print("Quel animal voulez-vous ajouter à l'animalerie ? ")

    var scan = readLine()
    var newanimal = scan.toString()

    animalerie.add(newanimal)

}

interface Animal {

    fun quiSuisJe()

    fun parler()
}

class Chien : Animal {
    override fun parler() {
        println("Chien: Wouaf Wouaf")
    }

    override fun quiSuisJe() {
        println("Chien: Je suis un chien")
    }
}

class Chat : Animal {
    override fun parler() {
        println("Chat: Miaou")
    }

    override fun quiSuisJe() {
        println("Chat: Je suis un chat")
    }
}

class Perroquet : Animal {
    override fun parler() {
        println("Perroquet: Je répète ce que tu dis")
    }

    override fun quiSuisJe() {
        println("Perroquet: Je suis un perroquet")
    }
}

class Animalerie {
    fun add(arg1: String) {

        if (arg1 != null) {
            var creation = concatenation("Votre nouvel animal ajouté à l'animalerie est le suivant: ", arg1)
            println(creation)

            print("Voulez vous ajouter d'autres animaux à l'animalerie ? Répondez 'oui' ou 'non': ")

            var scan = readLine()
            var reponse = scan.toString()

            while (reponse == "oui") {
                print("Quel animal voulez-vous ajouter ? (Pour arreter l'ajout, ecrivez 'stop'): ")

                var scan = readLine()
                var newanimal = scan.toString()

                var newcreation = concatenation("Votre nouvel animal ajouté à l'animalerie est le suivant: ", newanimal)
                println(newcreation)

                if (newanimal == "stop") {
                    println("L'ajout dans l'animalerie est terminé.")
                    break
                }
            }
            if (reponse == "non") {
                println("Votre animalerie est complétée.")
            }
            else {
                println("Fin du gestionnaire de l'animalerie.")
            }
        }
    }

    fun affiche() {
        println("La liste des quiSuisJe est la suivante: ")

        Chien().quiSuisJe()
        Chat().quiSuisJe()
        Perroquet().quiSuisJe()
    }

}