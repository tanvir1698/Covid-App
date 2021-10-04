package com.example.covidapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covidapp.R
import com.example.covidapp.data.model.Model
import com.example.covidapp.ui.adapter.PrecautionsAdapter
import kotlinx.android.synthetic.main.activity_precaution.recyclerView

class PrecautionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_precaution)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val precautionsList = ArrayList<Model>()
        precautionsList.add(
            Model(
                R.drawable.vaccine,
                "Get Vaccinated",
                "Get vaccinated and protect yourself and others from corona"
            )
        )
        precautionsList.add(
            Model(
                R.drawable.handwash,
                "Hand Wash",
                " Wash your hands well and often. Use hand sanitizer when you’re not near soap and water."
            )
        )
        precautionsList.add(
            Model(
                R.drawable.mask,
                "Wear Mask",
                "Masks are a key measure to suppress transmission and save lives."
            )
        )
        precautionsList.add(
            Model(
                R.drawable.home,
                "Stay at Home",
                "When you stay home, you help stop the spread to others, too."
            )
        )
        precautionsList.add(
            Model(
                R.drawable.socialdistance,
                "Social Distance",
                "When going out in public, maintain distance from other people ."
            )
        )

        val precautionsAdapter = PrecautionsAdapter(precautionsList)

        recyclerView.adapter = precautionsAdapter
    }
}
