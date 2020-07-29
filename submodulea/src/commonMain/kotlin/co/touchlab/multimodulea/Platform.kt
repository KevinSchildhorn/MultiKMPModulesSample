package co.touchlab.multimodulea

import co.touchlab.multimoduleb.CustomClass
import co.touchlab.multimoduleb.add

expect fun currentTimeMillis(): Long

fun timesTwo(a: Int) = add(a,a)

fun handleCustomClass(customClass: CustomClass): Int{
    print(customClass.str)
    return customClass.int
}

