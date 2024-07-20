package ui.uiScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.UserInfo
import ui.uiComponent.NavigationBar
import ui.uiComponent.NavigationItem
import ui.uiComponent.link

@Composable
fun AppScreen(
    userInfo: UserInfo,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        NavigationBar {
            link.forEach {
                NavigationItem(tittle = it)
            }
        }
        ContentScreen(userInfo)
    }
}