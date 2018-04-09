package com.arsan.learn_kotlin.model

import com.google.gson.annotations.SerializedName

data class Team (
    @SerializedName("idTeam")
    var teamID : String? = null,

    @SerializedName("strTeam")
    var teamName : String? = null,

    @SerializedName("strTeamBadge")
    var teamBadge : String? = null
)