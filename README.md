# Quote Generator

This program generates a random quote from a list of quotes and returns the author and the text itself.  The user can also pass in arguments to return a
quote containing a specific word, or a quote from a specific author.

## getRandomQuote

To return a random quote, just run `./gradlew run` from the terminal.  This will print a string containing the author and the text of the random quote.

## getRandomQuoteContaining

To get a random quote containing a word of your choice, run `./gradlew run --args 'contains [word]'` from the terminal.  The author and text of the quote
will print out to the terminal.  For example:  
`./gradlew run --args 'contains amazing'`

## getRandomQuoteAuthor

To get a random quote by an author of your choice, run `./gradlew run --args 'author [author (full name in double quotes)]'` from the terminal.  The author 
and text of the quote will print out to the terminal.  For example:  
`./gradlew run --args 'author "Louis Armstrong"'`

## Testing

To run the unit tests, just run `./gradlew test` from the terminal.