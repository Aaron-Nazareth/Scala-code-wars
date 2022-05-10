/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.

 */

object VowelCount {

  def getCount(inputStr: String): Int = {
    var counter = 0 // Set up a placeholder counter variable

    for {
      character <- inputStr.toCharArray
    } yield {
      character match {
        // In Scala, we use '...' for chars and "..." for strings
        case 'a' | 'e' | 'i' | 'o' | 'u' => counter += 1  // Add to counter if vowel is present
        case _ => counter // In all other cases, return counter
      }
    }
    counter // return counter as method return value
  }

}

/*
ALTERNATIVE SOLUTION:

def getCount(s: String): Int = {
    s.count("aeiou".contains(_))
  }

 */

/*
ALTERNATIVE SOLUTION:

def getCount(inputStr: String): Int = {
    val vowels = Set('a', 'e', 'i', 'o', 'u')
    inputStr.filter(vowels.contains).length
  }

 */
