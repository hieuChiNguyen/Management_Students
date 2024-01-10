package com.example.managementstudents

import android.app.Application
import com.example.managementstudents.data.StudentDatabase

class MyApplication: Application() {
    val database: StudentDatabase by lazy { StudentDatabase.getDatabase(this) }
}