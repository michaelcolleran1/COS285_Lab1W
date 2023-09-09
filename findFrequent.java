    //James Libby
    //findFrequent is a method that when given an array of type double it will 
    //find whatever number occurs the most in that array
    private static void findFrequent(double[] array) {
        //"l" is the length of the array, "freq" is the number "occurring" the most, "number" keeps track
        //of the amount of times a number occurred, and c is used to tell when a number has occurred more
        //than the current highest occurring number
        int l = array.length;
        double freq = 0;
        int number = 0;
        for(int i = 0; i < l; i++) {
            int c = 0;
            for(int j = 0; j < l; j++) {
                if(Double.compare(array[i],array[j]) == 0) {
                    c++;
                }
            }
            if(c > number) {
                number = c;
                freq = array[i];
            }
        }
    }