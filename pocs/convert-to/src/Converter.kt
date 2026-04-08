enum class DistanceUnit(val label: String) {
    METER("METER"),
    KM("KM"),
    MILE("MILE"),
    FOOT("FOOT")
}

object Converter {
    fun distance(value: Double, from: DistanceUnit, to: DistanceUnit): Double {
        val meters = when (from) {
            DistanceUnit.METER -> value
            DistanceUnit.KM    -> value * 1000
            DistanceUnit.MILE  -> value * 1609.34
            DistanceUnit.FOOT  -> value * 0.3048
        }
        return when (to) {
            DistanceUnit.METER -> meters
            DistanceUnit.KM    -> meters / 1000
            DistanceUnit.MILE  -> meters / 1609.34
            DistanceUnit.FOOT  -> meters / 0.3048
        }
    }
}