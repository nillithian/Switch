package com.company;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear ( int year ) {
        if ( ( year >= 9999 ) || ( year <= 1 ) ) {
            return false;
        } else if ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) {
            return true;
        } else if ( ( year % 100 == 0 ) && ( year % 400 == 0 ) ) {
            return true;
        }
        return false;


    }

    public static int getDaysInMonth (int month, int year) {
        if ((month < 1) || (month > 12) || (year <1 ) || (year > 9999)) {
            return -1;
        }
//        else if (!isLeapYear(year)) {

            switch (month) {
                case 1:
                    return 31;


                case  2: {
                    //return isLeapYear(year) == true ? 28 : 29;

                    if (!isLeapYear(year))
                        return 28;
                    else
                        return 29;
                }
                case 3:
                    return 31;


                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

            }

//        }
//        else if (isLeapYear(year)) {
//
//            switch (month) {
//                case 1:
//                    return 31;
//
//                case  2:
//                    return 29;
//
//                case 3:
//                    return 31;
//
//                case 4:
//                    return 30;
//
//                case 5:
//                    return 31;
//
//                case 6:
//                    return 30;
//
//                case 7:
//                    return 31;
//
//                case 8:
//                    return 31;
//
//                case 9:
//                    return 30;
//
//                case 10:
//                    return 31;
//
//                case 11:
//                    return 30;
//
//                case 12:
//                    return 31;
//
//            }
//        }
        return -2;
    }
}