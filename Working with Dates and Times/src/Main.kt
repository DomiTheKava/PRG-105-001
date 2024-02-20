import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    val formatDate = DateTimeFormatter.ofPattern("MM-dd-yyyy")
    val formatTime = DateTimeFormatter.ofPattern("m:s")

    val today = LocalDateTime.now()
    val fullMoon = LocalDateTime.of(2024, 1, 25, 10, 54, 43)

    var nextFullMoon = fullMoon
    var lastFullMoon = fullMoon

// need to get last full moon, then send the next one.
 while (nextFullMoon.month != today.month) {
     lastFullMoon = nextFullMoon
     nextFullMoon = nextFullMoon.plusDays(29)
     nextFullMoon = nextFullMoon.plusHours(12)
     nextFullMoon = nextFullMoon.plusMinutes(44)
 }

    // display info
    println()
    println("The current date is ${today.format(formatDate)} and it is currently ${today.format(formatTime)}")
    println()
    println("last full moon was at ${lastFullMoon.format(formatTime)} on ${lastFullMoon.format(formatDate)}")
    println("Next full moon will be at ${nextFullMoon.format(formatTime)} on ${nextFullMoon.format(formatDate)}")
    println()
}
// last full moon >>> Full moon	January 25, 2024	10:54:43 AM	249,011 miles >>> 29 days, 12 hours and 44 minutes each time
// sample result \/
//Today's date is: 6/28/2017
//The next full moon will be: 7/8/2017
//Wear silver or stay inside at night until 7/11/2017