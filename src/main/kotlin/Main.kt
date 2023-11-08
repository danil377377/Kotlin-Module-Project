import java.util.Scanner

class MenuItem(val name: String, val action: () -> Unit)

fun main(args: Array<String>) {
    val menu = MenuOfArchives()

    menu.showMenu()



}