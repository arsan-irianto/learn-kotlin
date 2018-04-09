package com.arsan.learn_kotlin.api

import com.arsan.learn_kotlin.BuildConfig

object TheSportDBApi {
    fun getTeams(league : String?) : String{
        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/search_all_teams.php?l=" +
                (league?.replace(" ","%20") ?: "")
    }
}