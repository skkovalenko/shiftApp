fun main() {
    val nameCity = getNameCity()
    val t = getTemperature(nameCity)
    val city = City(nameCity, t)
    println("В городе ${city.name} " + getConclusion(city))
}
private fun getNameCity() : String{
    println("Название город:")
    return readLine() ?: throw error("Нужно название")
}
private fun getTemperature(nameCity: String): Int{
    println("Температура в городе $nameCity:")
    return readLine() ?.toIntOrNull() ?: throw error("Нужно цифрами")
}
private fun getConclusion(city: City) : String =
    when(city.t){
        in -50..15 -> "Холодно"
        in 15..25 -> "Нормально"
        in 25..50 -> "Жарко"
        else -> "Катастрофа"
    }
