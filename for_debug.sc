def unless(condition: => Boolean)(block: => Unit) {
    if (!condition) block
}

unless(30 < 10) { println("unless") }


def unless1(condition: => Boolean)(block: => Unit) {
    if (!condition) block
}

val pos = 10

unless1(pos == 9) { println("ok") }