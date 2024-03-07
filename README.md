# Roman numerals 🥋

## Instructions

Write a program to convert Arabic numbers into their Roman numeral equivalents.

Your solution should contain one method similar to: 
> public string Convert(int amount)

Here, amount represents the Arabic number and the value this method returns is the string of Roman numerals.

### First iteration
Numbers from 1-4 should be represented by 'I' symbol in multiples to represent the number.

|Number  |  Numeral|
| ------ | ------- | 
|1       |        I|
|2       |       II|
|3       |      III|
|4       |     IIII|

Number 5 should be represented by 'V' symbol.

| Number | Numeral |
|--------|---------|
| 5      | V      |

For the single integers greater than 5, a new rule came into effect: when 'smaller' symbols are appended one or more 
times behind the 'larger' symbol, it is considered to be added to the value representing the larger symbol.

| Number | Numeral |
|--------|---------| 
| 6      | VI      |
| 7      | VII     |
| 8      | VIII    |
| 9      | VIIII   |
