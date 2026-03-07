package woowacourse.kanban.board.component.card

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class ContentTextTest {
    @Test
    fun `본문이 정상적으로 표시된다`() = runComposeUiTest {
        val content = "안녕하세요 본문입니다. 안녕하세요 본문입니다. 안녕하세요 본문입니다. 안녕하세요 본문입니다. 안녕하세요 본문입니다. 안녕하세요 본문입니다."

        setContent {
            ContentText(content)
        }

        onNodeWithText(content).assertExists()
    }
}
