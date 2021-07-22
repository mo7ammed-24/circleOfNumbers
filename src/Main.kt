fun main() {
    print(circleOfNumbers(10,2))
}

fun circleOfNumbers(n: Int, firstNumber: Int): Int {
    var myList=mutableListOf<Int>()
    for(i in 0 until n){
        myList.add(i)
    }
    var halfOfCircle=myList.size/2

    if(firstNumber<halfOfCircle)
        return myList[firstNumber+halfOfCircle]

    else
        return myList[firstNumber-halfOfCircle]
}
