package woowacourse.kanban.board.component.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import woowacourse.kanban.board.model.Tag

@Composable
fun TagChip(
    tag: String,
    modifier: Modifier = Modifier,
    maxLength: Int = 5,
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(Color(0xFFF3F4F6)),
    ) {
        Text(
            text = tag.take(maxLength),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 16.sp,
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 4.dp),
        )
    }
}

private class TagChipPreviewParameterProvider : PreviewParameterProvider<String> {
    override val values = sequenceOf(
        "안녕",
        "긴태그긴태그",
    )
}

@Preview(showBackground = true)
@Composable
private fun TagChipPreview(@PreviewParameter(TagChipPreviewParameterProvider::class) tag: String) {
    TagChip(tag = tag)
}
