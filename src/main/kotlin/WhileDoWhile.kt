fun main() {
    var number = 2;
    var counter = 1;

    // While Loop
    // Firstly check the condition and then execute block

    while (counter <=10){
        println(number * counter);
        counter++
    }

    println("\n\n")
    
    // DO while loop
    // Firstly execute the block and then check for condition
    // Do While loop will execute at least once.
    number = 9
    counter = 1;
    do{
        println(number*counter)
        counter ++;
    }while (counter <=10)
}