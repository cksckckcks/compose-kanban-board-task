package woowacourse.kanban.board.component.card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Tag

@Composable
fun TagChipGroup(
    tags: List<Tag>,
    modifier: Modifier = Modifier,
    maxTagCount: Int = 5,
) {
    FlowRow(
        modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        tags.take(maxTagCount)
            .forEach { tag ->
                TagChip(tag = tag)
            }
    }
}

private class TagChipGroupPreviewParameterProvider : PreviewParameterProvider<List<Tag>> {
    override val values = sequenceOf(
        listOf(Tag("태그"), Tag("태그"), Tag("안녕")),
        listOf(
            Tag("안녕하세요요요"),
            Tag("안녕하세요우오"),
            Tag("반갑습니다아아"),
            Tag("호기심입니다"),
            Tag("5번이에요"),
            Tag("6번이건보이면안돼"),
        ),
    )
}

@Preview(showBackground = true)
@Composable
private fun TagChipGroupPreview(@PreviewParameter(TagChipGroupPreviewParameterProvider::class) tags: List<Tag>) {
    Box(
        modifier = Modifier
            .width(200.dp),
    ) {
        TagChipGroup(tags = tags)
    }
}
