package woowacourse.kanban.board.component.card

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class TitleTextTest {
    @Test
    fun `제목이 정상적으로 표시된다`() = runComposeUiTest {
        val title = "안녕하세요 제목입니다."

        setContent {
            TitleText(title)
        }

        onNodeWithText(title).assertIsDisplayed()
    }
}
