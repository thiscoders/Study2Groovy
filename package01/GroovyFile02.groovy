/**
 * 完全Groovy风格的代码
 */

class Book {
    String title;
    int price;

    Book(String title, int price) {
        this.title = title
        this.price = price
    }

    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }

    int getPrice() {
        return price
    }

    void setPrice(int price) {
        this.price = price
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}


Book b1 = new Book("java", 100);

println b1.toString()
println b1.title + "..." + b1.price
