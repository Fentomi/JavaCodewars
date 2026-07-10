package com.evilcorp;

/*
Rules of the "Rock, Paper, Scissors" game are:

Rock beats Scissors,
Scissors beat Paper,
Paper beats Rock,
Two identical moves are a draw.
*/

public class RockPaperScissors {
  public static String rps(String p1, String p2) {
    if (p1.equals(p2)) return "Draw!";

    if (p1.equals("rock") && p2.equals("scissors")) return "Player 1 won!";
    else if (p1.equals("rock")) return "Player 2 won!";
    if (p1.equals("scissors") && p2.equals("paper")) return "Player 1 won!";
    else if (p1.equals("scissors")) return "Player 2 won!";
    if (p1.equals("paper") && p2.equals("rock")) return "Player 1 won!";
    else return "Player 2 won!";
  }
}
