package ui.uiComponent

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.techSkills
import model.UserInfo
import myresume.composeapp.generated.resources.Res
import myresume.composeapp.generated.resources.tech_skill_section
import org.jetbrains.compose.resources.stringResource
import ui.uiCore.ProfilePicture
import ui.uiCore.Skills
import ui.uiCore.TechSkillsRow
import ui.uiCore.UserDetails

@Composable
fun ProfileInfoSideBar(
    userInfo: UserInfo,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxHeight()
            .width(300.dp)
            .offset(y = 4.dp),
        shape = MaterialTheme.shapes.small
    ) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()).padding(
                top = 16.dp,
                start = 8.dp,
                end = 8.dp
            ),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfilePicture(userInfo.pictureProfile)
            UserDetails(userInfo)
            Skills(
                tittle = stringResource(Res.string.tech_skill_section),
                element = {
                    techSkills.forEach {
                        TechSkillsRow(skill = it)
                    }
                }
            )
        }
    }
}
