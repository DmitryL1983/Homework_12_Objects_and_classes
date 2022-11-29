public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        }
    public String getName() {
        return  this.name;
    }
    public String getAuthor() {
        return this.author.getAuthorName() + " " + this.author.getAuthorLastName();
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getName() + ", " + author.toString() + ", " + getYear();
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name.length() + author.toString().length() + year);
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        if (this.hashCode() != other.hashCode()) {
            return false;
        } else {
            return this.name == name && this.author.equals(author) && this.year == year;
        }
    }

}
