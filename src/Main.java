public class Main {
    public static void main(String[] args){
        Algorithms alg =  new Algorithms();
        Double[] l = alg.numberVictoriesTiesAndDefeats(4.0,2.0);

        System.out.println("won: " + l[0] + " tied: " + l[1] + " defeats: " + l[2]);
    }
}
