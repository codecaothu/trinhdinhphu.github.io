package lab10.ex1_1;

public class Library {
    Rent[] rent;
    public Library(Rent[] rent) {
        this.rent = rent;
    }

    public Rent getLongestRent(){
        long longest = 0;
        Rent longestRent = null;
        for (Rent rent : rent){
            long time = rent.end.getTime() - rent.begin.getTime();
            if (time > longest){
                longest = time;
                longestRent = rent;
            }
        }
        return longestRent;
    }


}
