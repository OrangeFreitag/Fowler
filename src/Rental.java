class Rental {
    Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    public double getCharge(){
        return movie.price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(){
        return movie.price.getFrequentRenterPoints(daysRented);
    }
}