


fun main(){
    val values = listOf(1,2,3,4,5,6,7,8,9,10)

    for (i in values){
        println(i)
    }
    //1. Loại for thứ 1 – Duyệt tuần tự hết giá trị trong danh sách (closed range)
    for(i in 1..10){
        println(i)
    }


    //2.  Loại for thứ 2 – Duyệt tuần tự gần hết giá trị trong danh sách
    for (i in 0 until 100){
        println(i)
    }
    //3. Loại for thứ 3 – Điều hướng bước nhảy step
    for (i in 0 until 100 step 50){
        println(i)
    }
    //4. Loại for thứ 4 – Điều hướng bước nhảy downTo
    for (i in 110 downTo 0 step 5){
        println(i)
    }
    //5. Loại for thứ 5 – Lặp tập đối tượng
    val people = listOf(
        Person("Bui"),
        Person("Huy"),
        Person("Hoa"),
    )
    //Duyệt danh sách tên đối tượng
    for (person in people){
        println(person)
    }
    //ta cũng có thể duyệt theo vị trí, từ vị trí này ta có thể xuất ra giá trị như sau:
    for (i in people.indices){
        println("Danh sách đối tượng có tên "+ people[i].name)
    }
    for ((index,value) in people.withIndex()){
        println("Đối tượng $index có tên $value")
    }
}
data class Person(var name: String)
