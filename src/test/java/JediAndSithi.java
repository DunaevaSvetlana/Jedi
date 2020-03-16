public class JediAndSithi {
    public static void main(String[] args) {
        final int jedi = 2;
        final int sith = 1;
        final boolean sithPalpatin = true;
        final boolean jediObiVanAndSithDartMol = true;
        if (((jediObiVanAndSithDartMol && (jedi == sith)) || (sith > jedi) || (sith < jedi)) && (!sithPalpatin)) {
            System.out.println("Выиграл Джедаи!");
        } else if (sithPalpatin || (sith == jedi)) {
            System.out.println("Выиграл Ситхи!");
        }
    }
}
