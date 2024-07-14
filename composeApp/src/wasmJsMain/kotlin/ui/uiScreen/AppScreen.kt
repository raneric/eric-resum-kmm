package ui.uiScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.UserInfo
import ui.uiComponent.NavigationBar

@Composable
fun AppScreen(
    userInfo: UserInfo,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        NavigationBar()
        ContentScreen(userInfo)
    }
}