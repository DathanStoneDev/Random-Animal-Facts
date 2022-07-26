package com.devstone.randomanimalfacts.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animals")
data class AnimalFact(
    val active_time: String,
    val animal_type: String,
    val diet: String,
    val geo_range: String,
    val habitat: String,
    @PrimaryKey val id: Int,
    val image_link: String,
    val latin_name: String,
    val length_max: String,
    val length_min: String,
    val lifespan: String,
    val name: String,
    val weight_max: String,
    val weight_min: String
)