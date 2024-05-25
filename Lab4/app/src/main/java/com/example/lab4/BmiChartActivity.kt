package com.example.lab4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class BmiChartActivity : AppCompatActivity() {
    private lateinit var bmiChart: LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_chart)

        bmiChart = findViewById(R.id.bmiChart)

        val bmiEntries = mutableListOf<Entry>()
        // Mocked data for BMI changes over time
        val bmiData = listOf(22.5f, 23.0f, 22.8f, 23.5f, 24.0f, 23.7f, 24.5f)
        for (i in bmiData.indices) {
            bmiEntries.add(Entry(i.toFloat(), bmiData[i]))
        }

        val lineDataSet = LineDataSet(bmiEntries, "BMI Changes Over Time")
        val lineData = LineData(lineDataSet)
        bmiChart.data = lineData
        bmiChart.invalidate() // refresh the chart
    }
}
