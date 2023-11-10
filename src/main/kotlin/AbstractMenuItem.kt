class AbstractMenuItem( val lastItem: MenuItem, val firstItem: MenuItem){

    val arrayOfItems = mutableListOf<MenuItem>(firstItem, lastItem)
    val arrayToAdd = mutableListOf<MenuItem>()
    fun addItem(item: MenuItem){
        arrayToAdd.add(item)
        arrayOfItems.clear()
        arrayOfItems.addAll(arrayOf(firstItem, *arrayToAdd.toTypedArray(), lastItem))
    }
}