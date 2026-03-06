package woowacourse.kanban.board.component.card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.sp

@Composable
fun ContentText(
    content: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = content,
        color = Color(0xff4A5565),
        fontSize = 16.sp,
        lineHeight = 24.sp,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = modifier,
    )
}

private class ContentPreviewParameterProvider : PreviewParameterProvider<String> {
    override val values = sequenceOf(
        "LazyColumn 컴포넌트 구현",
        "LazyColumn 컴포넌트 구현LazyColumn 컴포넌트 구현LazyColumn 컴포넌트 구현LazyColumn 컴포넌트 구현LazyColumn 컴포넌트 구현LazyColumn 컴포넌트 구현LazyColumn 컴포넌트 구현",
    )
}

@Composable
@Preview(showBackground = true)
private fun ContentTextPreview(@PreviewParameter(ContentPreviewParameterProvider::class) content: String) {
    ContentText(content = content)
}
