package com.example.tataletak

import android.R.attr.text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ColumnRow(modifier: Modifier){
    Column(modifier = modifier.padding(50.dp)){
        Text("wiwalkdetolk",
            modifier )
        Text("notonletalkdetolk")
    }
}
