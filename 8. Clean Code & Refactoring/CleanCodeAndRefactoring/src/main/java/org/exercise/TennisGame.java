package org.exercise;

public class TennisGame {

  public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {

    boolean isDraw = player1Score == player2Score;
    if (isDraw) {
      return getDrawScore(player1Score);
    }

    boolean isEnd = player1Score >= 4 || player2Score >= 4;
    if (isEnd) {
      return getEndScore(player1Score, player2Score);
    }
    String callScore = getScore(player1Score) + "-" + getScore(player2Score);
    return callScore;

  }

  private static String getScore(int playerScore) {

      switch (playerScore) {
        case 0:
          return  "Love";
        case 1:
          return "Fifteen";
        case 2:
          return "Thirty";
        default:
          return "Forty";
      }
    }


  private static String getDrawScore(int x) {
    switch (x) {
      case 0:
        return "Love-All";
      case 1:
        return "Fifteen-All";
      case 2:
        return "Thirty-All";
      case 3:
        return "Forty-All";
      default:
        return "Deuce";
    }
  }

  private static String getEndScore(int player1Score, int player2Score) {
    int minusResult = player1Score - player2Score;
    if (minusResult == 1) {
      return "Advantage player1";
    } else if (minusResult == -1) {
      return "Advantage player2";
    } else if (minusResult >= 2) {
      return "Win for player1";
    } else {
      return "Win for player2";
    }


  }

}
