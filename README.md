# Collaborative exercise - TicTacToe 

The goal of this exercise is to collaboratively develop a TicTacToe game. 
The structure of the code is defined in order to make it easier for you to collaborate. 
The main logic is provided, but the logic of three methods is still missing. 

Form groups of 3-4 people and split the open TODOs between all of you. 
Your team works in a single repository - make sure to frequently *pull* changes from the repository 
to get the code of your other contributors.

In the test folder are some Unit Tests that should help you verify, that your code works as expected. 
Make sure to implement your single method in a way that it passes all the unit tests!

## JUnit 

In order for the Unit Tests to work, you need to add JUnit5 to the class path.
When you hover over the `@Test` annotation in the test class and press `Alt+Einfg` you should get a suggestion that provides the `Add JUnit4 to classpath` functionality.

### Goal 

In the end an examplaray TicTacToe game should look like this: 

```
Welcome to TicTacToe
Player 1 choose your field [1-9]
5

 | | 
 |X| 
 | | 

Player 2 choose your field [1-9]
1

O| | 
 |X| 
 | | 

Player 1 choose your field [1-9]
3

O| |X
 |X| 
 | | 

Player 2 choose your field [1-9]
7

O| |X
 |X| 
O| | 

Player 1 choose your field [1-9]
4

O| |X
X|X| 
O| | 

Player 2 choose your field [1-9]
6

O| |X
X|X|O
O| | 

Player 1 choose your field [1-9]
8

O| |X
X|X|O
O|X| 

Player 2 choose your field [1-9]
2

O|O|X
X|X|O
O|X| 

Player 1 choose your field [1-9]
9

O|O|X
X|X|O
O|X|X

The game is over. It' a draw.
```

Or another game with an early win: 

```
Welcome to TicTacToe
Player 1 choose your field [1-9]
1

X| | 
 | | 
 | | 

Player 2 choose your field [1-9]
5

X| | 
 |O| 
 | | 

Player 1 choose your field [1-9]
2

X|X| 
 |O| 
 | | 

Player 2 choose your field [1-9]
4

X|X| 
O|O| 
 | | 

Player 1 choose your field [1-9]
3

X|X|X
O|O| 
 | | 

The game is over. Player 1 won!
```