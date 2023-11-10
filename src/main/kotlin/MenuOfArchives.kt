import java.util.*

class MenuOfArchives() {
    val lastItem = MenuItem("Выход") { println("exit"); System.exit(0) }
    val firstItem = MenuItem("Создать архив") { addItem() }
    val arrayOfItems = mutableListOf<MenuItem>(firstItem, lastItem)
    val arrayToAdd = mutableListOf<MenuItem>()


    val menu = Menu("Список архивов", arrayOfItems)


    fun addItem() {
        println("Введите название архива")
        val name = menu.inputName()
        val menuOfNotes = MenuOfNotes(this)
        val item = MenuItem(name) { menuOfNotes.showMenu() }
        arrayToAdd.add(item)
        arrayOfItems.clear()
        arrayOfItems.addAll(arrayOf(firstItem, *arrayToAdd.toTypedArray(), lastItem))







        showMenu()
    }


    fun showMenu() {
        menu.showMenu()

    }


}