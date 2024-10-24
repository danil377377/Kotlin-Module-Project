import java.util.Scanner

class Menu(val nameMenu: String,val arrayOfItems : MutableList<MenuItem>) {

    fun showMenu() {
        //println("Список архивов")
        println(nameMenu)
        arrayOfItems.forEach { i -> println("${arrayOfItems.indexOf(i)}. ${i.name}") }
        input()
    }
    fun inputName(): String{
        var name = scanner.nextLine()
        while(true){
            if(name == ""){
                println("Вы ничего не ввели")
            name = scanner.nextLine()
            }
            else break
        }
        return name
    }
    fun input(){
        while (true) {
            val input = scanner.nextLine().toIntOrNull()
            if (input == null) {
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