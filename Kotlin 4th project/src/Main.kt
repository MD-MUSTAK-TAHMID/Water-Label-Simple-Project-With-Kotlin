fun main() {
    println("How much money you have collected for the flood")
    var Money = readln().toInt()
    if (Money >=100000){
        println("Let's Go to Fani!")
        println("Have you booked a Boat? (Yes/No)")
        var Boat = readln()
        if (Boat == "Yes"){
           println("Let's go as soon as possible")
        }else if (Boat == "No"){
            println("Let's Book a boat")
        }else{
            println("Some thing is wrong")
        }
    }else if (Money >10000 && Money <100000){
        println("Donate this in an ENGIO" )
    }else if (Money <10000){
        println("Try to collect more money")
    }else{
        println("Something is Wrong")
    }
}