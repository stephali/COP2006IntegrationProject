package statequiz;

public class Score {
  int Score = 0;
  String scoreString = "";

  public int getScore() {
    return Score;
  }

  public String getScoreString() {
    return Integer.toString(Score) + scoreString;
  }

  public void setScore(int score) {
    Score += score;
  }

  public void setScore(int score, String scoreString) {
    Score += score;
    this.scoreString = scoreString;
  }

}
