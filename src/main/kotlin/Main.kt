fun main(args: Array<String>) {

    do{
        //1)
        var ans = interact()
    }while(ans=="Y")


}

fun interact():String{
    //2)
    print("Enter X: ")
    var input1:String? = readLine()!!
    if(input1 == null) input1 = "0"
    var X:Double = input1.toDouble()
    //3)
    print("Enter Y: ")
    var input2:String? = readLine()!!
    if(input2 == null) input2 = "0"
    var Y:Double = input2.toDouble()
    //4),5)
    val Z:Double = X+Y
    println("Sum of X and Y are : $Z")
    //6)
    print("Do you want to start programm again<Y/N>?")
    var inputAns:String? = readLine()!!
    if(inputAns==null)inputAns="N"
    //7),8),9)
    return inputAns
}

