// IGNORE

fun x() {}

class Foo {
    operator fun Int.invoke(): Foo = this@Foo

    val x = 0

    fun foo() = x()
}