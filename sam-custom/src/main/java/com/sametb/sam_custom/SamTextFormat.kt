package com.sametb.sam_custom

class SamTextFormat private constructor(private val text: String) {

    companion object {

        private const val ANSI_RESET            = "\u001B[0m"
        private const val ANSI_BOLD             = "\u001B[1m"
        private const val ANSI_ITALIC           = "\u001B[3m"
        private const val ANSI_UNDERLINE        = "\u001B[4m"
        private const val ANSI_COLOR_BLACK      = "\u001B[30m"
        private const val ANSI_COLOR_RED        = "\u001B[31m"
        private const val ANSI_COLOR_GREEN      = "\u001B[32m"
        private const val ANSI_COLOR_YELLOW     = "\u001B[33m"
        private const val ANSI_COLOR_BLUE       = "\u001B[34m"
        private const val ANSI_COLOR_MAGENTA    = "\u001B[35m"
        private const val ANSI_COLOR_CYAN       = "\u001B[36m"
        private const val ANSI_COLOR_WHITE      = "\u001B[37m"

        fun create(text: String): SamTextFormat { return SamTextFormat(text) }
    }

    fun reset(): SamTextFormat { return SamTextFormat("$text$ANSI_RESET") }

    fun bold(): SamTextFormat { return SamTextFormat("$ANSI_BOLD$text$ANSI_RESET") }

    fun italic(): SamTextFormat { return SamTextFormat("$ANSI_ITALIC$text$ANSI_RESET") }

    fun underline(): SamTextFormat { return SamTextFormat("$ANSI_UNDERLINE$text$ANSI_RESET") }

    fun black(): SamTextFormat { return SamTextFormat("$ANSI_COLOR_BLACK$text$ANSI_RESET") }

    fun red(): SamTextFormat { return SamTextFormat("$ANSI_COLOR_RED$text$ANSI_RESET") }

    fun green(): SamTextFormat { return SamTextFormat("$ANSI_COLOR_GREEN$text$ANSI_RESET") }

    fun yellow(): SamTextFormat { return SamTextFormat("$ANSI_COLOR_YELLOW$text$ANSI_RESET") }

    fun blue(): SamTextFormat { return SamTextFormat("$ANSI_COLOR_BLUE$text$ANSI_RESET") }

    fun magenta(): SamTextFormat { return SamTextFormat("$ANSI_COLOR_MAGENTA$text$ANSI_RESET") }

    fun cyan(): SamTextFormat { return SamTextFormat("$ANSI_COLOR_CYAN$text$ANSI_RESET") }

    fun white(): SamTextFormat { return SamTextFormat("$ANSI_COLOR_WHITE$text$ANSI_RESET") }

    override fun toString(): String { return "$text$ANSI_RESET" }

    fun print() { println("$text$ANSI_RESET") }
}