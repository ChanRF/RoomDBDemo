package my.edu.tarc.roomdbdemo.data

import androidx.annotation.ColorInt
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//anotation

@Entity(tableName ="product_table")
data class Product(

    @PrimaryKey (autoGenerate = true)
    var id:Int,

    // if no put (name= "description" ) it will show " name "
    @ColumnInfo
    var name: String,

    @ColumnInfo
    var price: Double

    )
