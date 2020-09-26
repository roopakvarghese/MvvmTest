package com.roopak.whiterabbittest.models

import com.google.gson.annotations.SerializedName

data class ApiResponse(val reps : List<Profiles>)

data class Profiles(val id: Int,
                    val name: String,
                    val username: String,
                    val email: String,
                    @SerializedName("profile_image") val profileImage: String,
                    val address: Address,
                    val phone: String,
                    val website: String,
                    val company: CompanyProfile)