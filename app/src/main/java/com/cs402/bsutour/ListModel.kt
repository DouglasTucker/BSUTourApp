package com.cs402.bsutour

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.concurrent.Executors

@Parcelize
public data class TourLocation(var name: String, var selected: Boolean, var Location: String, var visited: Boolean, var description: String, var image: String) : Parcelable


public class ListModel(pop: Int) : ArrayList<TourLocation>()  {


    val SimpleTourList = arrayListOf<TourLocation>(
        TourLocation("1.\tStudent Union Building",false, "43.60141111,-116.20187222", true,
            "This is one of the most used buildings on our campus and we recommend you start here on your walk. The SUB houses various student organizations and business offices including:\n" +
                    "\n" +
                    "Our Games Center (bowling alley, pool tables and air hockey galore)\n\n" +
                    "The Bronco Shop – make sure to stock up on some blue and orange gear!\n\n" +
                    "Some of our main food areas which includes Chick-fil-a, Moe’s Southwestern, Tree City Smoothies, Subway, Provisions on Demand (POD) and of course, a Starbucks. If you venture down the hallway, you will end up at the Boise River Cafe, our main cafeteria on campus.\n\n" +
                    "This building is also home to the Admissions office (shoutout!)",
            "t1"),
        TourLocation("2.\tRec Center",false, "43.60053889,-116.20010000", false,
            "Just across the street from the Student Union, you will find our award-winning, 105,000-square- foot Student Recreation Center. Membership is included in your student fees. It features basketball courts, exercise and weight rooms, racquetball courts, a multipurpose gym, an indoor running track, activity rooms, a 19,000-square-foot aquatics center and one of the largest collegiate climbing walls in the United States.",
            "t2"),
        TourLocation("3.\tAlbertsons Stadium",false, "43.60198889,-116.19707778", false,
            "Famous for its blue turf, visit the home of our Bronco football team. Stop in to our Boise State Hall of Fame to see some pieces of Boise State athletic history and take an iconic picture in front of the Blue field! (Bonus points for tagging Boise State Admissions).",
            "t3"),
        TourLocation("4.\tFirst-Year Village",false, "43.60398611,-116.19969444", false,
            "Take a stroll from the Stadium past Extra Mile Arena and through our housing quad where you can meander past five of our first year residence halls: Chaffee, Taylor, Keiser, Driscoll and Morrison.",
            "t4"),
        TourLocation("5.\tAlbertsons Library",false, "43.60393611,-116.20353333", false,
            "Take a few minutes to walk around our library! There are tons of study rooms, comfy “cocoon” chairs and gorgeous views of the Boise River.\n" +
                    "\n" +
                    "You can also access many resources as a student, including the largest map collection in the West, books, periodicals, U.S. Documents, textbooks and more. The higher you go in the library, the quieter it gets, and you’ll find some of the best views of the Boise River here.",
            "t5"),
        TourLocation("6.\tThe Quad",false, "43.60429444,-116.20435000", false,
            "Our quad is the center of our campus geographically and one of the busiest areas on campus. You can see the Administration Building which houses the office of our University President and other helpful offices like Financial Aid and Scholarships and the Registrar. Our solar-powered charging station is nearby if your phone needs a quick charge, and we highly recommend relaxing (or studying) on the lawn.",
            "t6"),
        TourLocation("7.\tFriendship Bridge",false, "43.60509444,-116.20379444", false,
            "Friendship Bridge symbolizes the friendship between Boise State and the city of Boise (can I get an “aww”?!) and is found right on the Boise Greenbelt, 25 miles of riverside trail.\n" +
                    "\n" +
                    "To get downtown from this bridge, you would turn left after crossing the bridge and then turn right onto Capitol Boulevard – a straight shot to the heart of downtown within a 15 minute walk. (You might even see a giraffe head poking out from Zoo Boise!)",
            "t7"),
        TourLocation("8.\tInteractive learning Center",false, "43.60494167,-116.20614444", false,
            "Wander around this building to get a sense of what Boise State classes may be like. This building holds study rooms and classrooms on floors 2-4 and a lecture hall on the first floor.\n" +
                    "\n" +
                    "This is also home to more food options such as Einstein’s Bagels, Papa John’s Pizza, Grille Works, Panda Express and Provisions on Demand (POD).",
            "t8"),
        TourLocation("9.\tCenter for Visual Arts",false, "43.60625833,-116.20926667", false,
            "Home to the Department of Art, Design and Visual Studies, our newest building on campus is an absolute show stopper! It is home to our World Museum, art spaces and incredible views of Downtown and into the Foothills.",
            "t9"),
        TourLocation("10.\tMicron Business and Economics Building",false, "43.60567778,-116.20950000", false,
            "Home of our College of Business and Economics (otherwise known as COBE), this building is full of classrooms, study spaces and a cozy lobby to get some studying done before class. This building is also home to Skaggs Hall of Learning our largest lecture hall on campus.",
            "t10"),
        TourLocation("11.\tB Plaza",false, "43.60341111,-116.20494444", false,
            "Finish up your tour with a picture at our famous “B” where students take their first pictures as Broncos when they visit campus for the first time. This spot is also a must for future graduation pictures!",
            "t11"),
    )

    val CampusFoodList = arrayListOf<TourLocation>(
        TourLocation("1.\tBoise River Cafe (SUB)",false, "43.60148,-116.20083",
            false, "HOURS:\n"+
                    "Monday\t7AM-9PM\n"+
                    "Tuesday\t7AM-9PM\n" +
                    "Wednesday\t7AM-9PM\n" +
                    "Thursday\t7AM-9PM\n" +
                    "Friday\t7AM-8PM\n" +
                    "Saturday\t10AM-8PM\n" +
                    "Sunday\t710AM-9PM\n",
            "f1"),
        TourLocation("2.\tSouthFork Market",false, "43.60115,-116.20253",
            false, "HOURS:\n"+
                    "Monday\t11AM-9PM\n"+
                    "Tuesday\t11AM-9PM\n" +
                    "Wednesday\t11AM-9PM\n" +
                    "Thursday\t11AM-9PM\n" +
                    "Friday\t11AM-9PM\n" +
                    "Saturday\tClosed\n" +
                    "Sunday\tClosed\n",
            "f2"),
        TourLocation("3.\tStarbucks (SUB)",false, "43.60189,-116.20180",
            false, "HOURS:\n"+
                    "Monday\t7:30AM-7PM\n"+
                    "Tuesday\t7:30AM-7PM\n" +
                    "Wednesday\t7:30AM-7PM\n" +
                    "Thursday\t7:30AM-7PM\n" +
                    "Friday\t7:30AM-7PM\n" +
                    "Saturday\t8AM-4PM\n" +
                    "Sunday\t8AM-4PM\n",
            "f3"),
        TourLocation("4.\tSubway (SUB)",false, "43.60199,-116.20145",
            false, "HOURS:\n"+
                    "Monday\t8AM-7PM\n"+
                    "Tuesday\t8AM-7PM\n" +
                    "Wednesday\t8AM-7PM\n" +
                    "Thursday\t8AM-7PM\n" +
                    "Friday\t8AM-7PM\n" +
                    "Saturday\t11AM-6PM\n" +
                    "Sunday\t11AM-6PM\n",
            "f4"),
        TourLocation("5.\tEinstein Bros. Bagels",false, "43.604967, -116.206179",
            false, "HOURS:\n"+
                    "Monday\t7:30AM-4PM\n"+
                    "Tuesday\t7:30AM-4PM\n" +
                    "Wednesday\t7:30AM-4PM\n" +
                    "Thursday\t7:30AM-4PM\n" +
                    "Friday\t8AM-3PM\n" +
                    "Saturday\tClosed\n" +
                    "Sunday\tClosed\n",
            "f5"),
        TourLocation("6.\tGuru Donuts",false, "43.603893,-116.203382",
            false, "HOURS:\n"+
                    "Monday\t7AM-4PM\n"+
                    "Tuesday\t7AM-4PM\n" +
                    "Wednesday\t7AM-4PM\n" +
                    "Thursday\t7AM-4PM\n" +
                    "Friday\t7AM-4PM\n" +
                    "Saturday\t9AM-5PM\n" +
                    "Sunday\t10:30AM-6PM\n",
            "f6"),
        TourLocation("7.\tPaddles Up Poke",false, "43.60583,-116.20591",
            false, "HOURS:\n"+
                    "Monday\t11AM-5PM\n"+
                    "Tuesday\t11AM-5PM\n" +
                    "Wednesday\t11AM-5PM\n" +
                    "Thursday\t11AM-5PM\n" +
                    "Friday\t11AM-5PM\n" +
                    "Saturday\tClosed\n" +
                    "Sunday\tClosed\n",
            "f7"),
        TourLocation("8.\tPoppy Seed Cafe",false, "43.60574,-116.21046",
            false, "HOURS:\n"+
                    "Monday\t8AM-6PM\n"+
                    "Tuesday\t8AM-6PM\n" +
                    "Wednesday\t8AM-6PM\n" +
                    "Thursday\t8AM-6PM\n" +
                    "Friday\t8AM-2PM\n" +
                    "Saturday\tClosed\n" +
                    "Sunday\tClosed\n",
            "f8"),
        TourLocation("9.\tChick-fil-A",false, "43.60190,-116.20155",
            false, "HOURS:\n"+
                    "Monday\t6:30AM-10PM\n"+
                    "Tuesday\t6:30AM-10PM\n" +
                    "Wednesday\t6:30AM-10PM\n" +
                    "Thursday\t6:30AM-10PM\n" +
                    "Friday\t6:30AM-10PM\n" +
                    "Saturday\t6:30AM-10PM\n" +
                    "Sunday\tClosed\n",
            "f9"),
        TourLocation("10.\tTree City & Smoothie Cafe",false, "43.60199,-116.20163",
            false, "HOURS:\n"+
                    "Monday\t9AM-3PM\n"+
                    "Tuesday\t9AM-3PM\n" +
                    "Wednesday\t9AM-3PM\n" +
                    "Thursday\t9AM-3PM\n" +
                    "Friday\t9AM-3PM\n" +
                    "Saturday\tClosed\n" +
                    "Sunday\tClosed\n",
            "f10"),
        TourLocation("11.\tPapa John's Pizza",false, "43.604940,-116.206303",
            false, "HOURS:\n"+
                    "Monday\t10:30AM-9PM\n"+
                    "Tuesday\t10:30AM-9PM\n" +
                    "Wednesday\t10:30AM-9PM\n" +
                    "Thursday\t10:30AM-9PM\n" +
                    "Friday\t10:30AM-9PM\n" +
                    "Saturday\tClosed\n" +
                    "Sunday\tClosed\n",
            "f11"),
    )

    val ComputerLabList = arrayListOf<TourLocation>(
        TourLocation("1.\tStudent Union Building",false, "43.60141111,-116.20187222", false, "Test Description", "t1"),
    )

    var ActiveList = SimpleTourList



    init {

        if(pop == 0){
            ActiveList = SimpleTourList
        } else if(pop == 1){
            ActiveList = CampusFoodList
        } else{
            ActiveList = ComputerLabList
        }

        val nst = Executors.newSingleThreadExecutor()
        nst.execute {
            val length = ActiveList.size;

            for (i in 0 until length) {
                add(ActiveList[i])
            }
        }
    }



}
