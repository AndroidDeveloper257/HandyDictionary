package com.example.handydictionary.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words_table")
data class Word(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "word_id")
    val id: Long? = null,
    @ColumnInfo(name = "word")
    val word: String? = null,
    @ColumnInfo(name = "translation")
    val translation: String? = null,
    @ColumnInfo(name = "translation_type")
    val type: Int? = null
)
/**
 * type is equal to
 *                  1 if en-uz
 *                  2 if uz-en
 */