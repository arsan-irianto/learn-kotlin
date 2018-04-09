package com.arsan.learn_kotlin

import com.arsan.learn_kotlin.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data : List<Team>)
}