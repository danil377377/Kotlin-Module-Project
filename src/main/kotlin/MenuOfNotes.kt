import java.util.Scanner

class MenuOfNotes(superMenu: MenuOfArchives) {
    val lastItem = MenuItem("Назад") { superMenu.showMenu() }
    val firstItem = MenuItem("Создать заметку") { addItem() }
    val abs = AbstractMenuItem(lastItem, firstItem)
    val menu = Menu("Список заметок", abs.arrayOfItems)







    fun addItem() {
        println("Введите название заметки")
        val name = menu.inputName()
        println("Введите текст заметки")
        val text = menu.inputName()
        val item = MenuItem(name) { println("Текст заметки \"$name\" : $text");showMenu() }
        abs.addItem(item)
        showMenu()
    }

    fun showMenu() {
        menu.showMenu()

    }


}