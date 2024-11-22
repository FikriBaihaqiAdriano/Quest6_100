package com.example.navigationwithdata.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationwithdata.R
import com.example.navigationwithdata.model.Mahasiswa
import com.example.navigationwithdata.model.RencanaStudi


@Composable
fun TampilHasilView(
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudi,
    onBackButtonClicked: () -> Unit
){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary))
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(50.dp)
            )
            Spacer(modifier = Modifier.padding(start = 16.dp))
            Column (modifier = Modifier.weight(1f)) {
                Text(
                    text = mahasiswa.nama,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Color.White
                )
                Text(
                    text = mahasiswa.nim,
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp,
                    color = Color.White
                )
            }
            Box{
                Icon(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
        Box(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topEnd = 15.dp,
                        topStart = 15.dp
                    )
                )
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Data Diri",
                    fontWeight = FontWeight.Bold,
                    fontSize = 19.sp
                )
                Text(
                    text = "Hasil Isi Rencana Studi kamu",
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.padding(8.dp))
                TemplatesHasil(judulParam = "Nama" , isiParam = mahasiswa.nama)
                Spacer(modifier = Modifier.padding(4.dp))
                TemplatesHasil(judulParam = "NIM" , isiParam = mahasiswa.nim)
                Spacer(modifier = Modifier.padding(4.dp))
                TemplatesHasil(judulParam = "Email" , isiParam = mahasiswa.email)
                Spacer(modifier = Modifier.padding(4.dp))
                TemplatesHasil(judulParam = "Matakuliah" , isiParam = rencanaStudi.namaMK)
                Spacer(modifier = Modifier.padding(4.dp))
                TemplatesHasil(judulParam = "Kelas" , isiParam = rencanaStudi.kelas)
                Spacer(modifier = Modifier.padding(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { onBackButtonClicked() }
                    ) {
                        Text("Kembali ke Halaman Utama")
                    }
                }
            }
        }
    }
}

@Composable
fun TemplatesHasil(judulParam:String, isiParam:String){
    Column{
        Row (
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Text(judulParam, modifier = Modifier.weight(0.8f))
            Text(":", modifier = Modifier.weight(0.2f))
            Text(isiParam, modifier = Modifier.weight(2f))
        }
    }
}