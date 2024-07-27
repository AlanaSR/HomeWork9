public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Грибоедов");
        Author author2 = new Author("Joanne", "Rowling");
        Book book1 = new Book("Горе от ума", author1, 2016);
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", author2, 2001);
        System.out.println("Книга " + book1.getNameBook() + ". Автор " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ". Год издания " + book1.getPublishingYear());
        System.out.println("Book " + book2.getNameBook() + ". Author " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ". The year of publishing " + book2.getPublishingYear());
        book1.setPublishingYear(1995);
    }
}