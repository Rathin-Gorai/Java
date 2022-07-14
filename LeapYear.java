class LeapYear{
    public static void main(String[] args){
        // Check leap year or not
        int year;
        year=2017;

    //     a=year%4;
    //     System.out.println(a);
    // }
        if(year%4 == 0){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap year");
        }
    }
}