/**
 * Created by djawed on 24/09/17.
 */
public class Joueurs {
    private String  pseudo;
    private static int score;

    public Joueurs(String pseudo, int score) {
        this.pseudo = pseudo;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int calculscore(int points){
        score+=points;
        return score;
    }
}
