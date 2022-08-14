import scala.util.Try
def unsafeMethod(): String = throw new RuntimeException("Sorry, not your day")

val potentialFailure = Try(unsafeMethod())
println(potentialFailure) // Failure(java.lang.RuntimeException: Sorry, not your day)
