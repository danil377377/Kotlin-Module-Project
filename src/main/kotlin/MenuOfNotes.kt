import java.util.Scanner

class MenuOfNotes(superMenu: MenuOfArchives) {
    val lastItem = MenuItem("Назад") { superMenu.showMenu() }
    val firstItem = MenuItem("Создать заметку") { addItem() }
    val arrayOfItems = mutableListOf<MenuItem>(firstItem, lastItem )
    val menu = Menu("Список заметок", arrayOfItems)





    fun addItem() {
        println("Введите название заметки")
        val name = menu.inputName()
        println("Введите текст заметки")
        val text = menu.inputName()
        val item = MenuItem(name) { println("Текст заметки \"$name\" : $text");showMenu() }
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