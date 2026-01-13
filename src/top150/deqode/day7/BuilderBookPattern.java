package top150.deqode.day7;

public class BuilderBookPattern {

    private String name;
    private String author;
    private String price;

    public BuilderBookPattern(BookBuilder bookBuilder) {
        name = bookBuilder.name;
        author = bookBuilder.author;
        price = bookBuilder.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    static class BookBuilder{
        private String name;
        private String author;
        private String price;

        public String getName() {
            return name;
        }

        public BookBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAuthor() {
            return author;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public String getPrice() {
            return price;
        }

        public BookBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public BuilderBookPattern build(){
            return new BuilderBookPattern(this);
        }
    }

    public static void main(String[] args) {
        new BookBuilder().build();
    }
}
