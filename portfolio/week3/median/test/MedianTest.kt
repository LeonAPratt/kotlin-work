// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Single value"{
        median(listOf(5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Odd number of elements"{
        median(listOf(5.0f,6.0f,7.0f)) shouldBe (6.0f plusOrMinus tolerance)
    }

    "Even number of elements"{
        median(listOf(6.0f,7.0f)) shouldBe (6.5f plusOrMinus tolerance)
    }

    "Unsorted array"{
        median(listOf(9.0f, 2.0f, 7.0f, 4.0f,5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }


})
