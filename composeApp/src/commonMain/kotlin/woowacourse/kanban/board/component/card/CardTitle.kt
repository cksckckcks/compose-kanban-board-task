package woowacourse.kanban.board.component.card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CardTitle(title: String? = null) {
    Text(
        text = title ?: "LazyColumn 컴포넌트 구현",
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview(showBackground = true)
@Composable
fun CardTitlePreview() {
    CardTitle()
}

@Preview(showBackground = true)
@Composable
fun CardTitleMaxPreview() {
    CardTitle(title = "너무너무 긴 제목은 한 줄까지만 노출너무너무 긴 제목은 한 줄까지만 노출...너무너무 긴 제목은 한 줄까지만 노출...너무너무 긴 제목은 한 줄까지만 노출...너무너무 긴 제목은 한 줄까지만 노출...너무너무 긴 제목은 한 줄까지만 노출...너무너무 긴 제목은 한 줄까지만 노출...")
}
