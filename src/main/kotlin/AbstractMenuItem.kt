abstract class AbstractMenuItem(){
    val arrayToAdd = mutableListOf<MenuItem>()
    val arrayOfItems = mutableListOf<MenuItem>()
fun addItem(text: String, funAdd: () -> MenuItem){
    println(text)

}
}