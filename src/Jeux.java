import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by djawed on 24/09/17.
 */
public class Jeux {
    private int nbrjoueurs;
    private int nbparties;
    private   String winner ;
    Scanner sc=new Scanner(System.in);
   ArrayList<Joueurs> j=new ArrayList<Joueurs>();


    public void paramJeu(){

        System.out.println("tappez le nombre de joueurs ");
        nbrjoueurs=sc.nextInt();
        System.out.println("entrez le pseudo des joueurs ");
        for (int y=0;y<nbrjoueurs;y++){
            String pseudo=sc.next();
            j.add(new Joueurs(pseudo,0));
        }
        System.out.println("tappez le nombre de parties souhaité ");
        nbparties=sc.nextInt();


    }

    public void winGame (){
        int bestScore=0;
        for(int i=0;i< j.size();i++){
        if(j.get(i).getScore()>bestScore){
            bestScore=j.get(i).getScore();
            winner=j.get(i).getPseudo(); }
        }
        System.out.print("the winner is the player "+winner+" his score is :  "+bestScore);
    }

    public void game(){
        paramJeu();
        System.out.println("debut de la partie");
        for (int i=0;i<nbparties;i++){
            for (int y=0;y<nbrjoueurs;y++){
                j.get(i).setScore(Joueurs.calculscore(De.lancer_de()));
            }
        }
        winGame();
    }


}
