package woowacourse.kanban.board.component.card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Profile(
    name: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp, end = 28.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "프로필 이미지",
            tint = Color(0xFF838383)
        )

        Text(
            text = name,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            lineHeight = 20.sp,
            color = Color(0xFF364153),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
    }
}

private class ProfilePreviewParameterProvider : PreviewParameterProvider<String> {
    override val values = sequenceOf(
        "김철수",
        "김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수"
    )
}

@Preview(showBackground = true)
@Composable
private fun ProfilePreview(
    @PreviewParameter(ProfilePreviewParameterProvider::class) name: String
) {
    Profile(name = name)
}
