fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (item in list) {
        if (item > 2) {
            toRemove.add(item)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val toRemoveSet = mutableSetOf<Int>()
    for (item in set) {
        if (item > 2) {
            toRemoveSet.add(item)
        }
    }
    set.removeAll(toRemoveSet)
    println(set) // Output: [1, 2]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    val toRemoveMapKeys = mutableListOf<Int>()
    for ((key, _) in map) {
        if (key > 2) {
            toRemoveMapKeys.add(key)
        }
    }
    toRemoveMapKeys.forEach { map.remove(it) }
    println(map) // Output: {1=one, 2=two}
}