import java.util.*

class MenuOfArchives() {
    val lastItem = MenuItem("Выход") { println("exit"); System.exit(0) }
    val firstItem = MenuItem("Создать архив") { inputItem() }
    val abs = AbstractMenuItem(lastItem, firstItem)



    val menu = Menu("Список архивов", abs.arrayOfItems)


    fun inputItem(){
        println("Введите название архива")
        val name = menu.inputName()
        val menuOfNotes = MenuOfNotes(this)
        val input = MenuItem(name) { menuOfNotes.showMenu() }
        abs.addItem(input)
        showMenu()
    }



    fun showMenu() {
        menu.showMenu()

    }


}