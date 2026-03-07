package woowacourse.kanban.board.model

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CrewTest {
    @Test
    fun `크루가 정상적으로 생성된다`() {
        val crewName = "볼트"

        val name = Crew(crewName)

        assertEquals(crewName, name.name)
    }

    @Test
    fun `이름이 비어있다면 생성되지 않는다`() {
        val crewName = ""

        assertFailsWith<IllegalArgumentException> {
            Crew(crewName)
        }
    }

    @Test
    fun `이름에 공백만 있다면 생성되지 않는다`() {
        val crewName = "    "

        assertFailsWith<IllegalArgumentException> {
            Crew(crewName)
        }
    }
}
