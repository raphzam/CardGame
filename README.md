#Card Game

This card game prompts the user for the numerical value of two cards. The program returns different results based on what the sum of the two cards is.

IPO

INPUT
    
    CARD VALUE 1
    CARD VALUE 2

OUTPUT

    "WELCOME"
    SUM OF TWO CARD VALUES
    IF SUM 21, ASTERISK IS DISPLAYED WITH SUM
    "GOODBYE"



PROCESS


BEGIN

    prompt user for card value 1
    get cardValue

    prompt user for card value 2
    get cardValue2

    if cardValue1 and cardValue2 are both 0
        display "GOODBYE" and quit the application

    else

    sum = cardValue1 + cardValue2
        if sum = 21
            display "21 *"
        else
            display sum
    
    REPEAT PROMPT FOR CARD VALUE 1 AND CARD VALUE 2 UNTIL
    USER ENTERS 0 AND 0


END