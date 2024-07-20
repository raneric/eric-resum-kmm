package model

import org.jetbrains.compose.resources.DrawableResource

data class SkillData(
    val tittle: String,
    val skills: Map<String, DrawableResource>
)
