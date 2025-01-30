package com.github.catomon.yukinotes.feature

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import com.github.catomon.yukinotes.UserSettings
import com.github.catomon.yukinotes.userFolderPath
import java.awt.Desktop
import java.io.File

@Composable
actual fun StoreAsTextCheckbox(
    settings: UserSettings,
    yukiViewModel: YukiViewModel
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text("Store as .txt (restart needed)", color = Color.White)

        Checkbox(settings.storeAsTxtFiles, onCheckedChange = {
            yukiViewModel.setStoreAsTxt(it)
        })
    }

    if (settings.storeAsTxtFiles)
        TextButton({
            val folder = File("$userFolderPath/notes/").also { it.mkdirs() }
            Desktop.getDesktop().open(folder.also { it.mkdirs() })
        }) {
            Text(
                "Open notes folder",
                color = Color.White,
                textDecoration = TextDecoration.Underline
            )
        }
}