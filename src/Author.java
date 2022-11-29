public class Author {
    private String authorName;
    private String authorLastName;
    public Author (String name, String lastName) {
            this.authorName = name;
            this.authorLastName = lastName;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public String getAuthorLastName() {
            return authorLastName;
        }

    @Override
    public String toString() {
        return authorName + " " + authorLastName;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName.length() + authorLastName.length());
    }

    @Override
    public boolean equals(Object other) {
        if (this.hashCode() != other.hashCode()) {
            return false;
        } else {
            return (this.authorName == authorName && this.authorLastName == authorLastName);
        }
    }
}
