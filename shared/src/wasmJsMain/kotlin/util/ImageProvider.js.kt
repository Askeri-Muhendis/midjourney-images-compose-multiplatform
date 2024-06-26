package util

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal actual fun getImageProvider(width: Dp): ImageProvider =
    ImageProvider(
        columnCount = fromWidth(width),
        itemHeight = 400.dp
    )

fun fromWidth(width: Dp): Int {
    return if (width < 1080.dp) {
        2
    } else if (width < 1440.dp) {
        3
    } else {
        4
    }
}
