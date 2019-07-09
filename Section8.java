import java.util.*;

public class Section8 {
    public static void main(String[] args) {
        int[] bruinsScores = {1,2,3,4,5};
        int[] oppScores = {3,3,3,1,5};

        System.out.println(gameResults(bruinsScores, oppScores, 3));

        printScores(bruinsScores, oppScores);

        System.out.println(anyTieGames(bruinsScores, oppScores));

        System.out.println((determineRecord(bruinsScores, oppScores).toString()));
    }

    static String gameResults(int[] a, int[] b, int game){
        game--;
        if(a[game] > b[game]){
            return "Win";
        }else if(a[game] < b[game]){
            return "Loss";
        }else{
            return "Tie";
        }
    }

    static void printScores(int[] a, int[] b){

        System.out.print("Bruins Scores: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\nOpponent Scores: ");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    static boolean anyTieGames(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            if(a[i] == b[i]){
                return true;
            }
        }
        return false;
    }

    static int[] determineRecord(int[] a, int[] b){
        int[] record = new int[3];

        for(int i = 0; i < a.length; i++){
            if(a[i] > b[i]){
                record[0]++;
            }else if(a[i] < b[i]){
                record[1]++;
            }else{
                record[2]++;
            }
        }
        return record;
    }
}
