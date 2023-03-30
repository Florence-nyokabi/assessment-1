fun main(){
    // Invoking takeString
    println(takeString("Florence", "Joy")) // one is longer
    println(takeString("Joy", "Ian")) // equal


    //invoking arrayElements
    println(arrayElements(arrayOf(10, 20, 30, 40, 50)))

    // Invoking calculateStats
    println(calculateStats(arrayOf(1,2,3,4,5,6,7,8,9,0)))

    // invoking split string
    splitString("Florence")
    splitString("Nyokabi")

    // Invoking join arrays
    println(joinArray(arrayOf("flo", "nyokabi", "wangui")))

    // Invoking class calculator
    var x = Calculator()
    println(x.addition(10, 20))
    println(x.substraction(10,20))
    println(x.multiplication(10,20))
    println(x.accurateDivision(10.5, 2.5))

}
/*
Question 1
Write and invoke a function that takes in any 2 strings and returns the first
character of the longer string or the first character of the first string if they are
equal in length.


Input: String1, string2
Output: Char
Process:    - compare length of string1, string2
            - return first char of the longer string
            - if equal return first of string1

 */

fun takeString(str1: String, str2: String): Char {
    return when {
        str1.length > str2.length -> str1[0]
        str2.length > str1.length -> str2[0]
        else -> str1[0]
    }
}
//method 2
fun getfirstChar(string1: String, string2: String ): Char{
    if(string1.length > string2.length || string2.length > string1.length){
        return string1[0]
    }else{
        return string2[0]
    }
}

/*
Question 2
Write and invoke one function that takes in an array of integers and returns
these 3 values: smallest, largest and average of all the elements
 */
fun arrayElements(integers: Array<Int>): Any{
    var minNum = integers.min()
    var maxNum = integers.max()
    var average = integers.average()

    return ("$minNum, $maxNum, $average")
}
/*
method 2
Input - Array<Int>
Output -max
        min
        avg
        dataclass


Process -
    create a data class.
    invoke inbuilt functions max, min, avg
    hold the values in variables.
    Instanciate the data class.
    Return the object.


    I Florence Wangui will solve the problem before I write the code.
 */

data class Statistics(var min: Int, var max: Int, var average: Double)

fun calculateStats(nums:Array<Int>): Statistics{
    val min = nums.min()
    val max = nums.max()
    val avg = nums.average()

    val stats = Statistics(min, max, avg)
    return  stats
}











/*
Question 3
Write and call a function that takes in a string and splits it into all the
characters that constitute it. Your function should print out this output.


Input: String

Output: Array<char>

Processs: Write a function
          - split.
          call function
 */
fun splitString(mystring: String){
    println(mystring.split(""))
}

/*
Question 4

Write and call a function that takes in an array of strings, joins them all into
one string and returns it.

Input: Array<strings>
Output: String
Process: functions(parameter)

 */
fun joinArray(array1: Array<String>): String{
//    return  array1.joinToString("")
    var x = ""
    for (i  in array1 ){
        x += i

    }
    return x
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
        class Calculator(){
            fun addition(number1: Int, number2: Int): Int{
                var sum = number1 + number2
                return sum
            }
            fun substraction(number3: Int, number4: Int): Int{
              var substract = number3 - number4
                return substract
            }
            fun accurateDivision(number5: Double, number6: Double): Double{
                var divide = number5 / number6
                return divide
            }
            fun multiplication(number7: Int, number8: Int): Int{
                var multiply = number7 * number8
                return multiply
            }
        }


