
class MovieStore {

    Movies[] movies = new Movies[20];
    int index = 0;

    void save(Movies movie) {
        if (index < this.movies.length) {
            this.movies[index] = movie;
            index++;
            System.out.println("Movie saved!");
        } else {
            System.out.println("Store is full!");
        }
    }

    void display(){
        boolean found = false;
        for (Movies temp : this.movies) {
            if (temp != null) {
                temp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("unable to display the movie values");
        }
    }

    void update(Movies oldName, Movies newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {
            for (int start = 0; start < movies.length; start++) {
                if (oldName == movies[start]) {
                    movies[start] = newName;
                    updated = true;
                    System.out.println("Updated successfully");
                }
            }

            if (!updated) {
                System.out.println("Old object not found");
            }
        } else {
            System.out.println("Old or new object cannot be null");
        }
    }
}

