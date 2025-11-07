package com.example.questnavigasitugas_093


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasitugas_093.ui.theme.view.FormIsian
import com.example.questnavigasitugas_093.ui.theme.view.TampilData

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding( isiRuang)
        ) {
            composable(route = Navigasi.Formulirku.name){
                FormIsian(
                    //pilihanJK = pilihanJK.map { id -> context.resources.getString(id) },
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }

                )
            }
            composable(route = Navigasi.Detail.name){
                TampilData(
                    onBackBtnClick = {
                        cancelAndBackToFormulirku(navController)
                    }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirku(
    navController: NavHostController
){
    navController.popBackStack(Navigasi.Formulirku.name,
        inclusive = false)
}
