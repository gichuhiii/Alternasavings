package com.example.alternasavings.utils

enum class Telco{
    SAFARICOM,
    AIRTEL,
    TELKOM,
    EQUITEL,
    FAIBA,
}
object Helpers {
    fun getPhoneProvider(input:String): Telco? {
        var telco:Telco? = null

        when(true){
            input.matches("^(\\+?254|0)?((7([0129][0-9]|4[0123568]|5[789]|6[89])|(1[1][0-5]))[0-9]{6})\$".toRegex()) -> telco = Telco.SAFARICOM
            input.matches("^(\\+?254|0)?(((7(3[0-9]|5[0-6]|6[27]|8[0-9]))|(1[0][0-6]))[0-9]{6})\$".toRegex()) -> telco = Telco.AIRTEL
            input.matches("^(\\+?254|0)?(((7(3[0-9]|5[0-6]|6[27]|8[0-9]))|(1[0][0-6]))[0-9]{6})\$".toRegex()) -> telco = Telco.TELKOM
            input.matches("^(\\+?254|0)?(77[0-9]{7})\$".toRegex()) -> telco = Telco.EQUITEL
            input.matches("^(\\+?254|0)?(747[0-9]{6})\$".toRegex()) -> telco = Telco.FAIBA
            else -> {}
        }

        return telco
    }
}