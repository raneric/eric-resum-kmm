package ui.uiScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.UserInfo
import ui.uiComponent.ProfileInfoSideBar
import ui.uiComponent.SocialNetworkBar

@Composable
fun ContentScreen(userInfo: UserInfo,modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        SocialNetworkBar(userInfo)
        ProfileInfoSideBar(userInfo)
    }
}