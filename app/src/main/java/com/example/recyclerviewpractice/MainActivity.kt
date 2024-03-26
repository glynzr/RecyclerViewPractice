package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList:ArrayList<Item>

    lateinit var imageList: ArrayList<Int>
    lateinit var titleList:ArrayList<String>
    lateinit var descriptionList:ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList= arrayListOf(
            R.drawable.book_24px,
            R.drawable.food_24px,
            R.drawable.fruit_24px,
            R.drawable.medicine_24px,
            R.drawable.star_24px,
            R.drawable.world_24px

        )

        titleList= arrayListOf(
            "Book","Food","Fruit","Medicine","Star","World"
        )
        descriptionList= arrayListOf(
            "All about books","All about food","All about fruit",
            "All about medicine","All about star","All about the world"
        )
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        dataList= arrayListOf<Item>()
        getData()
    }

    private fun getData(){
        for(i in imageList.indices){
            val data=Item(imageList[i],titleList[i],descriptionList[i])
            dataList.add(data)
        }
        recyclerView.adapter=Adapter(dataList)
    }
}