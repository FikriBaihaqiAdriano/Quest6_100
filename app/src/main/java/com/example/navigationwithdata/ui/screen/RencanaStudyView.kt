package com.example.navigationwithdata.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.navigationwithdata.R
import com.example.navigationwithdata.model.Mahasiswa


@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>)-> Unit,
    onBackButtonClicked: () -> Unit
) {
    var chosenDropdown by remember {
        mutableStateOf(
            ""
        )
    }
    var checked by remember {
        mutableStateOf(false)
    }

    var pilihanKelas by remember {
        mutableStateOf("")
    }

    var listData: MutableList<String> = mutableListOf(chosenDropdown,pilihanKelas)
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.primary))
    ) {

    }
}