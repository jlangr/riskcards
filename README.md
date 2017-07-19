# riskcards

See http://langrsoft.com/2017/07/17/tdd-kata-risk-card-sets/ for more info.

Part 1: Is the collection of cards a valid set?

Determine whether or not a collection of three (selected) cards represents a valid set that can be turned in. A valid set contains three cards either all with the same symbol, or each will different symbols.
The user has selected exactly three valid cards–the UI constrains how many cards can be selected–so your solution should concern itself with no other possibilities.

Examples of valid sets:

H-H-H

C-S-H

C-S-J (with the Joker acting as an H)

S-S-J (with the Joker acting as an S)

Examples of invalid sets:

H-H-C

S-S-H

Part 2: Does the collection of cards contain a valid set?

Determine whether or not a collection of 0 through 5+ cards (i.e. all the cards that a user holds) contains a valid set.
Five cards logically must always contain a valid set. The only case where a four card set is invalid is when it contains only two symbols, e.g. H-H-C-C.

Discussion / Suggestions

This is not a long kata: My first implementation (in Java, I’ll try another language next time) that covers both parts is essentially a complex conditional with four conditional expressions, probably 20 minutes of effort. It did bring up a couple interesting questions as I ran through it.

* How long did it take the first time through? The second time?
* If you lead others through this kata: How long does it take for someone new to TDD?
* Was this too difficult? Too easy?
* Functional approaches (LINQ, Java 8 streams, etc) seem to be the way to go. If you produce a more imperative solution, how many lines was your code? How readable by another developer?
* How much do your implementation choices leak into the test names? Do your test names describe it more from an implementation stance, in other words, or are they essentially a restatement of the Risk rules?
* Did you extract your conditional expressions into intention-declaring functions, or do you assume the ability of a developer to understand their intent? If you extracted conditionals, to what extent did you sacrifice performance to improve readability / composition?
* How many tests did you end up with for each part? Does it make sense to eliminate any (for the sake of keeping documentation simple) now that you have a complete solution?
* In Part 1, were there tests you felt compelled to write for confidence, but that passed immediately (i.e. you were unable to follow R-G-Refactor)? How might you have avoided this?
* Did some of your tests for Part 2 pass immediately? If so, what would have been a simpler solution for Part 1?
* When you built Part 2, did you factor it to take advantage of the method created in Part 1, or did you have the method created in Part 1 take advantage of the method created in Part 2? Or neither?
