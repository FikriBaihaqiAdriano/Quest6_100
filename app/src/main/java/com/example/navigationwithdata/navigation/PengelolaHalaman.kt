package com.example.navigationwithdata.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationwithdata.model.Mahasiswa
import com.example.navigationwithdata.ui.screen.MahasiswaFormView
import com.example.navigationwithdata.ui.screen.RencanaStudyView
import com.example.navigationwithdata.ui.screen.SplashView
import com.example.navigationwithdata.ui.viewmodel.MahasiswaViewModel
import com.example.navigationwithdata.ui.viewmodel.RencanaStudyViewModel
import java.security.AccessController

enum class Halaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}
