package com.edgar.assertj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAssertionsExamples {

  static final String ERROR_MESSAGE_EXAMPLE_FOR_ASSERTION = "{} assertion : {}\n";
  protected static final Logger logger = LoggerFactory.getLogger("[ERROR MESSAGE EXAMPLE]");
  protected static final Logger log = LoggerFactory.getLogger("\n");
  /**
   * log error message if one wants to see it "live".
   */
  protected static void logAssertionErrorMessage(String assertionContext, AssertionError e) {
    logger.info(ERROR_MESSAGE_EXAMPLE_FOR_ASSERTION, assertionContext, e.getMessage());
  }

//  // Some of the Lord of the Rings characters :
//  protected final TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
//  protected final TolkienCharacter sam = new TolkienCharacter("Sam", 38, HOBBIT);
//  protected final TolkienCharacter merry = new TolkienCharacter("Merry", 36, HOBBIT);
//  protected final TolkienCharacter pippin = new TolkienCharacter("Pippin", 28, HOBBIT);
//  protected final TolkienCharacter gandalf = new TolkienCharacter("Gandalf", 2020, MAIA);
//  protected final TolkienCharacter gimli = new TolkienCharacter("Gimli", 139, DWARF);
//  protected final TolkienCharacter legolas = new TolkienCharacter("Legolas", 1000, ELF);
//  protected final TolkienCharacter aragorn = new TolkienCharacter("Aragorn", 87, MAN);
//  protected final TolkienCharacter boromir = new TolkienCharacter("Boromir", 37, MAN);
//  protected final TolkienCharacter sauron = new TolkienCharacter("Sauron", 50000, MAIA);
//  protected final TolkienCharacter galadriel = new TolkienCharacter("Galadriel", 3000, ELF);
//  protected final TolkienCharacter elrond = new TolkienCharacter("Elrond", 3000, ELF);
//  protected final TolkienCharacter guruk = new TolkienCharacter("Guruk", 20, ORC);
//  protected final List<TolkienCharacter> fellowshipOfTheRing = new ArrayList<>();
//  protected final List<TolkienCharacter> orcsWithHobbitPrisoners = new ArrayList<TolkienCharacter>();
//
//  // Rings and their bearer
//  protected final List<Ring> ringsOfPower = newArrayList(oneRing, vilya, nenya, narya, dwarfRing, manRing);
//  protected final Map<Ring, TolkienCharacter> ringBearers = new HashMap<>();
//
//  // Lord of the Rings movies
//  protected final Movie theFellowshipOfTheRing = new Movie("the fellowship of the Ring", parse("2001-12-19"), "178 min");
//  protected final Movie theTwoTowers = new Movie("the two Towers", parse("2002-12-18"), "179 min");
//  protected final Movie theReturnOfTheKing = new Movie("the Return of the King", parse("2003-12-17"), "201 min");
//  protected final Movie theSilmarillion = new Movie("the Silmarillion", parse("2030-01-01"), "unknown");
//  protected final List<Movie> trilogy = newArrayList(theFellowshipOfTheRing, theTwoTowers, theReturnOfTheKing);
//
//  // Various comparators
//  protected Comparator<TolkienCharacter> ageComparator = new AgeComparator();
//  protected Comparator<TolkienCharacter> raceNameComparator = new TolkienCharacterRaceNameComparator();
//  protected Comparator<String> caseInsensitiveStringComparator = new CaseInsensitiveStringComparator();
//  protected Comparator<Integer> absValueComparator = new AbsValueComparator<Integer>();
//  protected Comparator<Character> caseInsensitiveComparator = new CaseInsensitiveCharacterComparator();
//  protected Comparator<Date> yearAndMonthComparator = new YearAndMonthDateComparator();
//
//  protected static BasketBallPlayer rose;
//  protected static BasketBallPlayer james;
//  protected static BasketBallPlayer durant;
//  protected static BasketBallPlayer noah;
//  protected static BasketBallPlayer tonyParker;
//  protected static BasketBallPlayer dwayne;
//  protected static List<BasketBallPlayer> basketBallPlayers;
//  protected static PotentialMvpCondition potentialMvp;
//  protected static Condition<BasketBallPlayer> doubleDoubleStats;
//
//  @BeforeClass
//  public static void setUpOnce() {
//    rose = new BasketBallPlayer(new Name("Derrick", "Rose"), "Chicago Bulls");
//    rose.setAssistsPerGame(8);
//    rose.setPointsPerGame(25);
//    rose.setReboundsPerGame(5);
//    tonyParker = new BasketBallPlayer(new Name("Tony", "Parker"), "Spurs");
//    tonyParker.setAssistsPerGame(9);
//    tonyParker.setPointsPerGame(21);
//    tonyParker.setReboundsPerGame(5);
//    james = new BasketBallPlayer(new Name("Lebron", "James"), "Miami Heat");
//    james.setAssistsPerGame(6);
//    james.setPointsPerGame(27);
//    james.setReboundsPerGame(8);
//    dwayne = new BasketBallPlayer(new Name("Dwayne", "Wade"), "Miami Heat");
//    dwayne.setAssistsPerGame(16);
//    dwayne.setPointsPerGame(55);
//    dwayne.setReboundsPerGame(16);
//    durant = new BasketBallPlayer(new Name("Kevin", "Durant"), "OKC");
//    durant.setAssistsPerGame(4);
//    durant.setPointsPerGame(30);
//    durant.setReboundsPerGame(5);
//    noah = new BasketBallPlayer(new Name("Joachim", "Noah"), "Chicago Bulls");
//    noah.setAssistsPerGame(4);
//    noah.setPointsPerGame(10);
//    noah.setReboundsPerGame(11);
//
//    noah.getTeamMates().add(rose);
//    rose.getTeamMates().add(noah);
//
//    dwayne.getTeamMates().add(james);
//    james.getTeamMates().add(dwayne);
//
//    basketBallPlayers = newArrayList(rose, james, dwayne, durant, noah);
//    potentialMvp = new PotentialMvpCondition();
//    doubleDoubleStats = new Condition<BasketBallPlayer>("double double stats") {
//      @Override
//      public boolean matches(BasketBallPlayer player) {
//        if (player.getPointsPerGame() >= 10 && player.getAssistsPerGame() >= 10) return true;
//        if (player.getPointsPerGame() >= 10 && player.getReboundsPerGame() >= 10) return true;
//        if (player.getAssistsPerGame() >= 10 && player.getReboundsPerGame() >= 10) return true;
//        return false;
//      }
//    };
//  }
//
//  @Before
//  public void setup() {
//    // let's do some team building :)
//    fellowshipOfTheRing.add(frodo);
//    fellowshipOfTheRing.add(sam);
//    fellowshipOfTheRing.add(merry);
//    fellowshipOfTheRing.add(pippin);
//    fellowshipOfTheRing.add(gandalf);
//    fellowshipOfTheRing.add(legolas);
//    fellowshipOfTheRing.add(gimli);
//    fellowshipOfTheRing.add(aragorn);
//    fellowshipOfTheRing.add(boromir);
//    // ring bearers
//    ringBearers.put(Ring.nenya, galadriel);
//    ringBearers.put(Ring.narya, gandalf);
//    ringBearers.put(Ring.vilya, elrond);
//    ringBearers.put(Ring.oneRing, frodo);
//    orcsWithHobbitPrisoners.add(guruk);
//    orcsWithHobbitPrisoners.add(merry);
//    orcsWithHobbitPrisoners.add(pippin);
//  }

}