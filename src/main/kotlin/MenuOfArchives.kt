import java.util.*

class MenuOfArchives() {
    val lastItem = MenuItem("Выход") { println("exit"); System.exit(0)}
    val firstItem = MenuItem("Создать архив") { addItem() }
    val arrayOfItems = mutableListOf<MenuItem>(firstItem, lastItem )


    val menu = Menu("Список архивов", arrayOfItems)




    fun addItem() {
        println("Введите название архива")
        val name = menu.inputName()
        val menuOfNotes = MenuOfNotes(this)
        val item = MenuItem(name) { menuOfNotes.showMenu() }
        arrayOfItems.add(item)

        val transfer = item
        arrayOfItems[arrayOfItems.indexOf(item)] = lastItem
        arrayOfItems[arrayOfItems.indexOf(lastItem)] = transfer


        showMenu()
    }


    fun showMenu() {
        menu.showMenu()

    }


}