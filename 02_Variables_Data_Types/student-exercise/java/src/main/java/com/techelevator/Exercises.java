package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoons = 3;
		int numberGoHome = 2;
		int numberOfRaccoonsLeft = numberOfRaccoons - numberGoHome;
		System.out.println("3. 3 - 2 =" + numberOfRaccoonsLeft);
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberBees = 3;
		int numberOfExtraFlowers = numberOfFlowers - numberBees;
		System.out.println("4. 5 - 3 =" + numberOfExtraFlowers);

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int pidgonOne = 1;
		int pidgonTwo = 1;
		int numberOfPidgons = pidgonOne + pidgonTwo;
		System.out.println("5. 1 + 1 =" + numberOfPidgons);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owls = 3;
		int joinedOwls = 2;
		int numberOfOwls = owls + joinedOwls;
		System.out.println("6. 3 + 2 =" + numberOfOwls);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int beavers = 2;
		int beaversSwimming = 1;
		int numberOfBeavers = beavers - beaversSwimming;
		System.out.println("7. 2 - 1 =" + numberOfBeavers);
		
		
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucans = 2;
		int newToucans = 1;
		int numberOfToucans = toucans + newToucans;
		System.out.println("8. 2 + 1 =" + numberOfToucans);
		
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrels = 4;
		int nuts = 2;
		int numberOfSquirrels = squirrels / nuts;
		System.out.println("9. 4 / 2 =" + numberOfSquirrels);
				
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		double Q = 0.25;
		double D = 0.10;
		double N = 0.05;
		
		double money = Q + D + (2 * N);
		System.out.println("10. total money = $" + money);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier = 18;
		int mcAdams= 20;
		int flannery = 17;
		
		int totalCupcakes = brier + mcAdams + flannery;
		System.out.println("11. total cupcakes =" + totalCupcakes);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = 0.24;
		double whistle = 0.14;
		double toys = yoyo + whistle;
		System.out.println("12. Total for toys=" + toys);
		
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
			
		int largeMarshmellows = 8;
		int smallMarshmellows = 10;
		int totalMarshmellows = largeMarshmellows + smallMarshmellows;
		System.out.println("13. Mrs. Hilt used a total of "  + totalMarshmellows + " marshmellows to make 5 treats");
		
		
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHiltHouse = 29;
		int snowAtSchool = 17;
		int totalSnow = snowAtHiltHouse - snowAtSchool;
		System.out.println("14. Mrs. Hilt got "  + totalSnow + " inches more at her house");
		

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		
		double hiltMoney = 10;
		double toyTruck = 3;
		double pencilCase = 2; 
		double hiltMoneyLeft = hiltMoney - toyTruck - pencilCase;
		System.out.println("15. Mrs. Hilt has $"  + hiltMoneyLeft + "0 left");
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbles = 16;
		int lostMarbles = 7;
		int totalMarblesLeft = marbles - lostMarbles;
		System.out.println("16. Josh has " + totalMarblesLeft + " marbles left.");
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		
		int seashells = 19;
		int totalSeashells = 25;
		int seashellsLeft = totalSeashells - seashells;
		System.out.println("17. Megan has " + seashellsLeft + " seashells left to find.");

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int balloons = 17;
		int redBalloons = 8;
		int totalGreenBalloons = balloons - redBalloons;
		System.out.println("18. Brad has " + totalGreenBalloons + " green balloons.");
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		int books = 38;
		int moreBooks = 10;
		int totalBooks = books + moreBooks;
		System.out.println("19. Marts has put " + totalBooks + " books on the shelf.");
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		
		int beeLegs = 6;
		int lotsOfBees = 8;
		int totalLegsOnBees = beeLegs * lotsOfBees;
		System.out.println("20. 8 Bees have " + totalLegsOnBees + " legs.");
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		
		double iceCreamCone = 0.99;
		double moreCones = 2;
		double totalIceCreamCones = iceCreamCone * moreCones;
		System.out.println("21. Mrs. Hilt's ice cream cones costs $" + totalIceCreamCones);
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksSheHas = 64;
		int totalSheNeeds = 125;
		int totalRocksLeft = totalSheNeeds - rocksSheHas;
		System.out.println("22. Mrs. Hilt's garden needs " + totalRocksLeft + " more rocks");
		
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltsMarbles = 38;
		int hiltslostMarbles = 15;
		int hiltsLeftMarbles = hiltsMarbles - hiltslostMarbles;
		System.out.println("23. Mrs. Hilt has " + hiltsLeftMarbles + " marbles left");

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int concertDistance = 78;
		int milesDriven = 32;
		int totalMilesLeft = concertDistance - milesDriven;
		System.out.println("24. The Hilt's have " + totalMilesLeft + " miles left to drive.");
		
        /*
    25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double satMorning = 1.30;
		double satAfternoon= .45;
		double totalTime = satMorning + satAfternoon;
		System.out.println("25. She spent " + totalTime + " shoveling snow.");
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		double hotdogs = 6;
		double costOfHotdogs = .50;
		double totalOfHotdogs = hotdogs * costOfHotdogs;
		System.out.println("26. 6 hotdogs cost $" + totalOfHotdogs + "0");
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double moneySheHas = 0.50;
		double pencils = 7;
		double totalForPencils = moneySheHas * pencils;
		System.out.println("27. Mrs. Hilt's pencils costs $" + totalForPencils + "0");
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterflies = 33;
		int orangeButterflies = 20;
		int totalRedButterflies = butterflies - orangeButterflies;
		System.out.println("28. there are " + totalRedButterflies + " red butterflies.");
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double kateHas = 1.00;
		double candy = .54;
		double totalChangeBack = kateHas - candy;
		System.out.println("29. Kate has $" + totalChangeBack);
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int trees = 13;
		int plantedTrees = 12;
		int totalAmountOfTrees = trees + plantedTrees;
		System.out.println("30. there are " + totalAmountOfTrees + " trees.");
		
        /*
  		31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int days = 2;
		int hoursInDay = 24;
		int totalAmountOfHours = days * hoursInDay;
		System.out.println("31. " + totalAmountOfHours + " hours till she sees her grandma.");
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		
		int cousins = 4;
		int piecesOfGum = 5;
		int totalPiecesOfGum = cousins * piecesOfGum;
		System.out.println("32. " + totalPiecesOfGum + " pieces of gum.");
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danHas = 3.00;
		double candyBar = 1.00;
		double dansTotalChangeBack = danHas - candyBar;
		System.out.println("33. Dan has $" + dansTotalChangeBack + "0");
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int numBoats = 5;
		int numPeople = 3;
		int totalNumOfPeople = numBoats * numPeople;
		System.out.println("34. " + totalNumOfPeople + " people on boats.");
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legos = 380;
		int lostLegos = 57;
		int totalLegosLeft = legos - lostLegos;
		System.out.println("35. there are " + totalLegosLeft + " left.");
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffins = 35;
		int totalMuffins= 83;
		int muffinsLeftToBake= totalMuffins - muffins;
		System.out.println("36. there are " + muffinsLeftToBake + " muffins left to bake.");
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int totalDifference= willyCrayons - lucyCrayons;
		System.out.println("37. Willy has " + totalDifference + " crayons more.");
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		
		int pagesStickers = 22;
		int stickersOnPage = 10;
		int totalStickers = pagesStickers * stickersOnPage;
		System.out.println("38. Total stickers=" + totalStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		
		int cupcakes = 96;
		int kids = 8;
		int totalCupcakesEach = cupcakes / kids;
		System.out.println("39. Each kid gets=" + totalCupcakesEach);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int glassJar = 6;
		int remainingCookies = gingerbreadCookies % glassJar;
		System.out.println("40. six cookies in each jar=" + remainingCookies + " left not in jar.");
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissants = 59;
		int neighbors= 8;
		int remainingCroissants= croissants % neighbors;
		System.out.println("41. there are " + remainingCroissants + " left for Marian.");
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealCookies = 276;
		int cookiesOnTrays= 12;
		int totalTraysUsed = oatmealCookies / cookiesOnTrays;
		System.out.println("42. there are " + totalTraysUsed + " trays for Marian.");
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480;
		int perServing= 12;
		int totalOfServings = pretzels / perServing;
		System.out.println("43. there are " + totalOfServings + " servings avaliable.");
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int orphanCupcakes = 53;
		int lemon= 2;
		int lemonboxes = 3;
		int totalGivenAway = (orphanCupcakes - lemon) / lemonboxes;
		System.out.println("44. there are " + totalGivenAway + " lemon boxes.");
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrots = 74;
		int peopleEating= 12;
		int totalCarrotsLeft = carrots % peopleEating;
		System.out.println("45. there are " + totalCarrotsLeft + " uneaten.");
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddybears = 98;
		int bedroomShelf = 7;
		int totalShelfs = teddybears / bedroomShelf;
		System.out.println("46. " + totalShelfs + " shelfs.");
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		
		int pictures = 480;
		int album = 20;
		int totalAmountOfAlbums = pictures / album;
		System.out.println("47. " + totalAmountOfAlbums + " albums.");
		
        /*
  		48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cards = 94;
		int fullBox = 8;
		int totalAmountOfboxes = cards / fullBox;
		int unfilledBoxes = cards % fullBox;
		System.out.println("48. " + totalAmountOfboxes + " boxes.");
		System.out.println("48. " + unfilledBoxes + " boxes.");
		
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int readingBooks = 210;
		int bedroomShelfs = 10;
		int totalReadingShelfs = readingBooks / bedroomShelfs;
		System.out.println("49. " + totalReadingShelfs + " books on each shelfs.");
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int tinaCroissants = 17;
		int guests = 7;
		int totalEachHave = tinaCroissants % guests;
		System.out.println("50."  + totalEachHave + " each get.");
		
		
		
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String firstName = "Allie";
		String lastName = "Sacharski";
		String middleInitial = "C";
		String variantFullName = lastName + "," + firstName + " " + middleInitial + ".";
		System.out.println("Challenge Problem 2:" + variantFullName);
				
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
