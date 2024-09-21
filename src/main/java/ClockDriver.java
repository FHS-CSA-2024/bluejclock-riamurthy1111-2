package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        System.out.println("Testing Clock Display: ");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("/tEmpty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay (2, 45);
        String test2Output = test2.getTime();
        System.out.println("/t2 Arg Con. Test - " + test2Output);
        test2.setTime (5,15);
        String test3Output = test2.getTime();
        System.out.println("/t Set Time Test - " + test3Output);
        
        ClockDisplay tickTest1 = new ClockDisplay (3,32);
        String tickTest1Output = tickTest1.getTime();
        System.out.println("/tTickTest1 Before increment - " + tickTest1Output);
        
        
        tickTest1.timeTick();
        tickTest1Output = tickTest1.getTime();
        System.out.println("/tTickTest1 After increment - " + tickTest1Output);
        
        ClockDisplay tickTest2 = new ClockDisplay (3,9);
        String tickTest2Output = tickTest2.getTime();
        System.out.println("/tTickTest2 Before increment - " + tickTest2Output);
        
        
        tickTest2.timeTick();
        tickTest2Output = tickTest2.getTime();
        System.out.println("/tTickTest2 After increment - " + tickTest2Output);
        
        ClockDisplay tickTest3 = new ClockDisplay (1,59);
        String tickTest3Output = tickTest3.getTime();
        System.out.println("/tTickTest3 Before increment - " + tickTest3Output);
        
        
        tickTest3.timeTick();
        tickTest3Output = tickTest3.getTime();
        System.out.println("/tTickTest3 After increment - " + tickTest3Output);
        
        ClockDisplay tickTest4 = new ClockDisplay (9,59);
        String tickTest4Output = tickTest4.getTime();
        System.out.println("/tTickTest4 Before increment - " + tickTest4Output);
        
        
        tickTest4.timeTick();
        tickTest4Output = tickTest4.getTime();
        System.out.println("/tTickTest4 After increment - " + tickTest4Output);

        
        ClockDisplay tickTest5 = new ClockDisplay (23,59);
        String tickTest5Output = tickTest5.getTime();
        System.out.println("/tTickTest5 Before increment - " + tickTest5Output);
        
        
        tickTest5.timeTick();
        tickTest5Output = tickTest5.getTime();
        System.out.println("/tTickTest5 After increment - " + tickTest5Output);
        
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        ClockDisplaySeconds test = new ClockDisplaySeconds();
        System.out.println(test.getTime());
        ClockDisplaySeconds test7 = new ClockDisplaySeconds(1, 33, 33);
        System.out.println(test7.getTime());
        test7.setTime(6, 30, 30);
        System.out.println(test7.getTime());
        test7.timeTick();
        
        ClockDisplaySeconds test8 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println(test8.getTime());
        test8.timeTick();
        System.out.println(test8.getTime());
        
        ClockDisplaySeconds test9 = new ClockDisplaySeconds(1, 0, 59);
        System.out.println(test9.getTime());
        test9.timeTick();
        System.out.println(test9.getTime());
        
        ClockDisplaySeconds test10 = new ClockDisplaySeconds(1, 59, 59);
        System.out.println(test10.getTime());
        test10.timeTick();
        System.out.println(test10.getTime());
        
        ClockDisplaySeconds test11 = new ClockDisplaySeconds(23, 59,59);
        System.out.println(test11.getTime());
        test11.timeTick();
        System.out.println(test11.getTime());
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        ClockDisplay12Hour t = new ClockDisplay12Hour();
        System.out.println(t.getTime());
        
        ClockDisplay12Hour t2 = new ClockDisplay12Hour(1, 33, "PM");
        System.out.println(t2.getTime());
        t2.setTime(2,45,"AM");
        System.out.println(t2.getTime());
        t2.timeTick();
        System.out.println(t2.getTime());
        
        ClockDisplay12Hour t3 = new ClockDisplay12Hour(3, 32, "PM");
        System.out.println(t3.getTime());
        t3.timeTick();
        System.out.println(t3.getTime());
        
        ClockDisplay12Hour t4 = new ClockDisplay12Hour(11, 59, "PM");
        System.out.println(t4.getTime());
        t4.timeTick();
        System.out.println(t4.getTime());
        
        ClockDisplay12Hour t5 = new ClockDisplay12Hour(11, 59, "AM");
        System.out.println(t5.getTime());
        t5.timeTick();
        System.out.println(t5.getTime());
        
        ClockDisplay12Hour t6 = new ClockDisplay12Hour(12, 59, "PM");
        System.out.println(t6.getTime());
        t6.timeTick();
        System.out.println(t6.getTime());
        
    }
}
