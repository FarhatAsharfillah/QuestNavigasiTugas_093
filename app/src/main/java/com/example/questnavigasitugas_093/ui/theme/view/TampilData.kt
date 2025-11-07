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
    Scaffold (modifier = Modifier,
        {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.tampil), color = Color.White)},
                colors = TopAppBarDefaults
                    .mediumTopAppBarColors(colorResource(id=R.color.teal_700))
            )
        }){ isiRuang ->
        Column (modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween){
            Column (modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_small))){
                items.forEach {item ->