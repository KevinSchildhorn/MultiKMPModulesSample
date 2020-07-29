package co.touchlab.multimodulea

import co.touchlab.multimoduleb.add

expect fun currentTimeMillis(): Long

fun timesTwo(a: Int) = add(a,a)

