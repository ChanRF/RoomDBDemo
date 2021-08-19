package my.edu.tarc.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface ProductDao {

    @Insert
    fun insertProduct (product :Product)


}