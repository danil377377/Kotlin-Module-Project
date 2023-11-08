import java.util.Scanner

class Menu(val nameMenu: String,val arrayOfItems : MutableList<MenuItem>) {

    fun showMenu() {
        //println("Список архивов")
        println(nameMenu)
        arrayOfItems.forEach { i -> println("${arrayOfItems.indexOf(i)}. ${i.name}") }
        input()
    }
    fun inputName(): String{
        var name = Scanner(System.`in`).nextLine()
        while(true){
            if(name == ""){
                println("Вы ничего не ввели")
            name = Scanner(System.`in`).nextLine()
            }
            else break
        }
        return name
    }
    fun input(){
        while (true) {
            val scanner = Scanner(System.`in`)
            val input = scanner.nextLine()
            if (input.toIntOrNull() == null) {
                println("Нужно ввести номер пункта")
                continue
            } else if (input.toInt() >= 0 && input.toInt() +1  <= arrayOfItems.size) {
                arrayOfItems[input.toInt()].action()

            } else {
                println("Такого пункта нет")
            }
        }
    }
}