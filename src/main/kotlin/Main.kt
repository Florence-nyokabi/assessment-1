fun main(){
    println(takeString("school", "church"))
    println(splitString("Nyokabi"))

   var x = Calculator(10, 20)
    println(addition())
    println(addition())


}
/*
Question 1
Write and invoke a function that takes in any 2 strings and returns the first
character of the longer string or the first character of the first string if they are
equal in length.

 */
fun takeString(word1: String, word2: String): Char{
    if (word1 >= word2)
    return word1[0]
    else
    {
        return word2[0]
    }
}

/*
Question 2
Write and invoke one function that takes in an array of integers and returns
these 3 values: smallest, largest and average of all the elements
 */
fun arrayElements(integers: Array<Int>){
    var array1 = [10, 20, 30, 40]

}

/*
Question 3
Write and call a function that takes in a string and splits it into all the
characters that constitute it. Your function should print out this output.
*/
fun splitString(mystring: String){
    var name = mystring.split(mystring)
    println(name)
}

/*
Question 4
Write and call a function that takes in an array of strings, joins them all into
one string and returns it.
 */
fun joinArray(array1: Array<String>) {
    var joinstrings = array1.split()
    println


}

/*
       Question 5
       Create a calculator class that is capable of the following functions:
       (i) Addition of any 2 numbers
       (ii) Subtraction between any 2 numbers
       (iii) Accurate division between any 2 numbers
       (iv) Multiplication of any 2 numbers
       Instantiate your calculator object and invoke all its functions
        */
        class Calculator(var num1: Int, var num2: Int){
            fun addition(): Int{
                return num1 + num2
            }
            fun substraction(): Int{
                return num1 - num2
            }
            fun accurateDivision():Int{
                return num1 / num2
            }
            fun multiplication():Int {
                return num2 * num2
            }
        }
