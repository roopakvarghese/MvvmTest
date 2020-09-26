package com.roopak.whiterabbittest.models

data class Address(val street: String,
                   val suite: String,
                   val city: String,
                   val zipcode: String,
                   val bs: GeoLocation)