package com.example.questnavigasitugas_093.ui.theme.view



import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.questnavigasitugas_093.R

@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )