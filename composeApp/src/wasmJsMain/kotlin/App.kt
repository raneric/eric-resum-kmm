import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import ui.theme.MyResumeTheme
import ui.uiComponent.NavigationBar
import ui.uiScreen.ContentScreen

@Composable
fun App() {
    MyResumeTheme {
        Column {
            NavigationBar()
            ContentScreen()
        }
    }
}