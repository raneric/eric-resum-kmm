import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import data.myInfo
import ui.theme.MyResumeTheme
import ui.uiComponent.NavigationBar
import ui.uiScreen.AppScreen
import ui.uiScreen.ContentScreen

@Composable
fun App() {

    MyResumeTheme {
        AppScreen(userInfo = myInfo)
    }
}