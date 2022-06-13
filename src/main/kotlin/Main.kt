fun equalsOperator() {
    val a = 10
    val b = 10
    println(a === b)

    val c = Integer(10)
    val d = Integer(10)
    println(c === d)

    val colors = arrayOf("red", "blue")
    val colors2 = arrayOf("blue", "red")
    println(colors contentEquals colors2)
}

fun factorial(n: Long, accum: Long = 1): Long {
    val sum = n * accum
    return if (n <= 1) {
        sum
    } else {
        factorial(n - 1, sum)
    }
}

fun objects() {
    val p1 = Person("alberto", 20)
    val p2 = Person(age = 22, name = "alberto")
}

class Person(
    val name: String,
    val age: Int,
)


fun letKeyword() {
    val nums = listOf<Int?>(1, null, 3)
    for (n in nums) {
        n?.let { println(n) }
    }
}

fun alsoKeyword() {
    val nums = listOf<Int?>(1, null, 3)
    var sum = 0
    for (n in nums) {
        n?.let { }
            ?.also { sum += n }
    }
    println(sum)
}

fun elvisOperator() {
    val value: String = "name"
    val res = value?.length ?: -1
    println("len: $res")
}

fun filterFromList() {
    val list: List<String?> = listOf("a", null, "b")
    val res = list.filterNotNull()
    println("filtered list ${res}")
}

object Counter {
    var count: Int = 0
    fun currentCount() = count
    fun increment() {
        ++count
    }
}

class StaticClass {
    companion object {
        @JvmStatic
        val staticField = 42
    }
}

data class Movie(var name: String, var studio: String, var rating: Float)

val square = { number: Int -> number * number }

val theList = listOf("one", "two", "three")
val theMutableList = mutableListOf("one", "two", "three")

val theSet = setOf("one", "two", "three")
val theMutableSet = mutableSetOf("one", "two", "three")

val theMap = mapOf(1 to "one", 2 to "two", 3 to "three")
val theMutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

val unfilteredList = listOf(1, 2, -3, -4, 5, -6)

val firstList = listOf("one", "two", "three")
val secondList = listOf("four", "five", "six")

fun main(args: Array<String>) {
    equalsOperator()
    println(factorial(10))
    objects()
    letKeyword()
    alsoKeyword()
    elvisOperator()
    filterFromList()

    Counter.increment()
    println(Counter.currentCount())
    println(Counter.count)

    val movie = Movie("Whiplash", "Sony Pictures", 8.5F)
    println(movie.name)
    println(movie.studio)
    println(movie.rating)
    movie.rating = 9F
    println(movie.toString())

    val betterRating = movie.copy(rating = 9.5F)
    println(betterRating.toString())

    println(square(3))

    val list = listOf("one", "two", "three")
    println("two" in list)
    println(unfilteredList.filter{ it > 0})

    println(firstList + secondList)
    println(firstList - secondList)
    println(list.slice(1..2))
    println(list.filterNotNull())
    println(list.drop(2))

    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6)
    println(listOfNumbers.groupBy{ it % 3})
    println(listOfNumbers.map{ it * it })
    println(listOfNumbers.map{ it * it })
    println(listOfNumbers.fold(0, {acc, i -> acc + (i * i)}))
    println(listOfNumbers.chunked(2))
    println(listOfNumbers.windowed(3))
}
