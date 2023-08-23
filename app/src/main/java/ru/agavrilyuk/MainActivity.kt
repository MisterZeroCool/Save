package ru.agavrilyuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.agavrilyuk.dao.Dao
import ru.agavrilyuk.databinding.ActivityMainBinding
import ru.agavrilyuk.entity.Item

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = MainDB.getDB(this)

        binding.btSave.setOnClickListener {
            val item = Item(null,
                binding.editName.text.toString(),
                binding.editPrice.text.toString(),
                )
            Thread{
                db.getDao().insertItem(item)
            }.start()

        }
    }
}