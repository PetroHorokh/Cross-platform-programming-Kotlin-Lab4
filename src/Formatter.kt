import java.util.regex.Pattern

class Formatter {

    companion object {
        var pattern: String = "yyyy-MM-dd"

        fun isValidDate(date: String): Boolean {
            val regex = "^\\d{4}-\\d{2}-\\d{2}$"
            val pattern = Pattern.compile(regex)
            val matcher = pattern.matcher(date)
            return matcher.matches()
        }
    }
}