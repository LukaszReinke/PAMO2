/*
* You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
*/

// Use a while loop.

fun main() {
    var pizzaSlices = 0
    while (pizzaSlices < 8) {
        println("There's only ${pizzaSlices} slice/s of pizza :(")
        pizzaSlices++
    }
    println("There are ${pizzaSlices} slices of pizza. Hooray! We have a whole pizza! :D")
}

// Use a do-while loop.

fun main() {
    var pizzaSlices = 0
    do {
        println("There's only ${pizzaSlices} slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    println("There are ${pizzaSlices} slices of pizza. Hooray! We have a whole pizza! :D")
}
