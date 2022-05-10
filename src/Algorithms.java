public class Algorithms {

    /**
     * @param numberOfMatches Number of single team matches
     * @param points Amount of related team points
     * @return An array with victories (0 index), ties (1 index) and defeats (2 index) of the related team
     */
    public Double[] numberVictoriesTiesAndDefeats(Double numberOfMatches, Double points){
        Double[] numberVictoriesTiesAndDefeats = new Double[3];
        Double matchesWon, tiedMatches = 0.0, lostMatches = 0.0;
        Double parcialMatchesWon;


        if (points == 0){
            matchesWon = 0.0;
            lostMatches = numberOfMatches;
        } else if (points == 3 * numberOfMatches){
            matchesWon = numberOfMatches;
            lostMatches = 0.0;
        }
        else {
            parcialMatchesWon = (points - numberOfMatches) / 2;

            // Improve the code
            boolean l = (parcialMatchesWon != 1 && parcialMatchesWon % 2 != 0), s = (points - numberOfMatches) > -1;
            //

            if (l && s) {
                numberOfMatches--;
                lostMatches++;
                matchesWon = (points - numberOfMatches) / 2;
            } else matchesWon = (parcialMatchesWon);

            tiedMatches = numberOfMatches - matchesWon;
        }

        // Declarative impl
        numberVictoriesTiesAndDefeats[0] = matchesWon;
        numberVictoriesTiesAndDefeats[1] = tiedMatches;
        numberVictoriesTiesAndDefeats[2] = lostMatches;

        return numberVictoriesTiesAndDefeats;
    }
}
