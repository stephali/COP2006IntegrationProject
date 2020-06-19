package statequiz;

/**
 * This class implements the score system into the quiz.
 * 
 * @author Stephanie Ali
 *
 */
public class Score {
  /**
   * Score holds the score as an int of 0.
   */
  private int score = 0;
  /**
   * This is what prints after your score.
   */
  private String scoreString = "";

  /**
   * This returns the score.
   * 
   * @return score
   */
  public int getScore() {
    return score;
  }

  /**
   * This returns your score as a string.
   * 
   * @return Integer.toString(Score) + scoreString
   */
  public String getScoreString() {
    return Integer.toString(score) + scoreString;
  }

  /**
   * This adds the new points you gained on your score to the Score.
   * 
   * @param score sends in the number 1 if the question is correct
   */
  public void setScore(int score) {
    this.score += score;
  }

  /**
   * This sets the score from main and saves it to the score in this class.
   * 
   * @param score sends in the number 1 if the question is correct
   * @param scoreString sends in the /5!
   */
  public void setScore(int score, String scoreString) {
    this.score += score;
    this.scoreString = scoreString;
  }

}
