import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private Superuser admin;
    private ArrayList<RegUser> regUsers;

    public Library(Superuser admin) {
        this.books = new ArrayList<Book>();
        this.admin = admin;
        this.regUsers = new ArrayList<RegUser>();
    }
    
    public Library(ArrayList<Book> books, Superuser admin) {
        this.books = books;
        this.admin = admin;
        this.regUsers = new ArrayList<RegUser>();
    }

    public Library(ArrayList<Book> books, Superuser admin, ArrayList<RegUser> regUsers) {
        this.books = books;
        this.admin = admin;
        this.regUsers = regUsers;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getAdminName() {
        return admin.getName();
    }

    public ArrayList<RegUser> getRegUsers() {
        return regUsers;
    }

    public void addRegUser(RegUser regUser) {
        regUsers.add(regUser);
    }

    public String toString() {
        String out = "";
        out += "Library Admin: " + admin.getName() + "\n";
        for(Book book : books) {
            out += book + " | ";
        }
        out += "\n";
        for(RegUser regUser : regUsers) {
            out += regUser + " | ";
        }
        return out;
    }

}
