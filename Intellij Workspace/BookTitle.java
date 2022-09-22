public abstract class BookTitle {
        String mBookTitle;
        double mPrice;
        String title;
        public BookTitle(String title){
            mBookTitle=title;
        }
        public String getmBookTitle(){
            return mBookTitle;
        }
        public double getPrice(){
            return mPrice;
        }
        public abstract void setPrice();
    }
 class Fiction extends BookTitle{

    public Fiction(String title) {
        super(title);
        setPrice();
    }

    public void setPrice(){
        this.mPrice=29.99;
    }
}
 class NonFiction extends BookTitle{

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    public void setPrice(){
        this.mPrice=39.99;
    }
}
class UseBookTitle{
    public static void main(String[] args){
        BookTitle books;
        books=new Fiction("Title for fiction: Harry potter");
        System.out.println(books.getmBookTitle()); System.out.print("Price for Fiction Book="); System.out.println(books.getPrice());
        books=new NonFiction("Title for Non Fiction: Calculus");
          System.out.println(books.getmBookTitle()); System.out.print("Price for Non fiction:"); System.out.println(books.getPrice());
    }
}
