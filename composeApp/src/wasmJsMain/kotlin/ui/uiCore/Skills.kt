package ui.uiCore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import model.SkillData
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import ui.theme.darkBlueBackground
import ui.theme.wheatFontColor

@Composable
fun Skills(
    tittle: String,
    element: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        SectionTitle(title = tittle)
        Spacer(modifier = Modifier.size(8.dp))
        Card {
            Column {
                element()
            }
        }
    }
}


@Composable
fun SectionTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        color = wheatFontColor,
        textAlign = TextAlign.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp)
            .clip(MaterialTheme.shapes.small)
            .background(darkBlueBackground)
    )
}

@Composable
fun TechSkillsRow(
    skill: SkillData,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Divider()
        Text(
            text = skill.tittle,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Divider()
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth()
        ) {
            skill.skills.forEach {
                TechSkillItem(name = it.key, icon = it.value)
            }
        }
    }
}

@Composable
fun TechSkillItem(name: String, icon: DrawableResource, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(icon),
            modifier = Modifier.size(32.dp),
            contentDescription = null
        )
        Text(
            text = name,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.caption
        )
    }
}