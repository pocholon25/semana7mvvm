package pe.idat.appmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pe.idat.appmvvm.auth.AuthViewModel
import pe.idat.appmvvm.auth.authScreen
import pe.idat.appmvvm.ui.theme.AppMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppMVVMTheme {
                authScreen(AuthViewModel())
            }
        }
    }
}

