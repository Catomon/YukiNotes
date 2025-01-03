package com.github.catomon.yukinotes.feature

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import yukinotes.composeapp.generated.resources.Res
import yukinotes.composeapp.generated.resources.menu
import yukinotes.composeapp.generated.resources.snowflake

@Composable
fun TopBar(menuButtonClicked: () -> Unit) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.background(Colors.yukiHair)
    ) {
        Image(painterResource(Res.drawable.snowflake), "App Icon", Modifier.size(32.dp))

        Text("YukiNotes 0.1", color = Color.White, modifier = Modifier.padding(start = 8.dp))

        Spacer(Modifier.weight(2f))

        Image(painterResource(Res.drawable.menu), "App Menu", Modifier.size(32.dp).clickable(onClick = menuButtonClicked))
    }
}