package com.example.navigationwithdata.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigationwithdata.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update {stateMK -> stateMK.copy(namaMK = mkPilihan) }
    }

    fun setKelas(kelasPilihan: String) {
        _krsState.update {stateKelas -> stateKelas.copy(namaMK = kelasPilihan) }
    }

    fun saveDataKRS(ls: MutableList<String>) {
        _krsState.update { status -> status.copy(
            namaMK = ls[0],
            kelas = ls[1]
        )
        }
    }
}