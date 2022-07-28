/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
*/

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    var contP: Int = 0
    var contN: Int = 0
    var answerNull = arrayOf<Int>()
    
    if (input == null || input.size == 0) return answerNull
        
    for (x : Int in input){ 
        if (x > 0){ // positive
          contP ++
        }
        
        if (x < 0){ //negative
            contN = x + contN           
        }    
    }
    var answer = arrayOf<Int>(contP, contN)
    return answer    
}
