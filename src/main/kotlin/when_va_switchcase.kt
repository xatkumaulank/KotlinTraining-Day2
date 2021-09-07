


fun main(){
    val option = 10
    when(option){
        1 -> println("This is number 1")
        2 -> println("This is number 2")
        3 -> println("This is number 3")
        4 -> println("This is number 4")
        5 -> println("This is number 5")
        else -> println("Nothing")
    }

    val month = 9
    when(month){
        1,2,3-> println("This is quarter 1")
        4,5,6 -> println("This is quarter 2")
        7,8,9 -> println("This is quarter 3")
        10,11,12 -> println("This is quarter 4")
        else -> println("Nothing")
    }


    when(month){
        in 1..3 -> println("This is quarter 1")
        in 4..6 -> println("This is quarter 1")
        in 7..9 -> println("This is quarter 1")
        in 10..12 -> println("This is quarter 1")
    }


   
}