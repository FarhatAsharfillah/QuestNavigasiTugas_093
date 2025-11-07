package com.example.questnavigasitugas_093

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasitugas_093.ui.theme.view.Beranda
import com.example.questnavigasitugas_093.ui.theme.view.FormIsian
import com.example.questnavigasitugas_093.ui.theme.view.TampilData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Surface(color = MaterialTheme.colorScheme.background) {
                NavHost(
                    navController = navController,
                    startDestination = "beranda"
                ) {
                    composable("beranda") {
                        Beranda(
                            onSubmitClick = { navController.navigate("formisian") }
                        )
                    }
                    composable("formisian") {
                        FormIsian(
                            OnSubmitBtnClick = { navController.navigate("tampildata") }
                        )
                    }
                    composable("tampildata") {
                        TampilData(
                            onBackBtnClick = { navController.navigate("beranda") }
                        )
                    }
                }
            }
        }
    }
}
