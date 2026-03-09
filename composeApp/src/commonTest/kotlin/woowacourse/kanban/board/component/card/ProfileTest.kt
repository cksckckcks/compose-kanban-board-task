package woowacourse.kanban.board.component.card

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class ProfileTest {
    @Test
    fun `크루 이름이 정상적으로 표시된다`() = runComposeUiTest {
        val crewName = "볼트"

        setContent {
            Profile(crewName)
        }

        onNodeWithText(crewName).assertIsDisplayed()
    }
}
