
class Books{
  static int BookId; static String BookName;
  static String BookAuthor; static String YearofPub;
  static float price; static String Status;
  Books(int BookId,String BookName,String BookAuthor,String YearofPub,
        float price,String Status){
       this.BookId=BookId; this.BookName=BookName;
       this.BookAuthor=BookAuthor; this.YearofPub=YearofPub;
       this.price=price; this.Status=Status;
  }
   void AddNewBooks(){
    System.out.println("New Book Aded");
   }
   void DeleteBooks(){
    System.out.println("Book Deleted");
   }
   void DisplayBookDetails(int BookId,String BookName,String BookAuthor,String YearofPub,
   float price,String Status){
    System.out.println("Book Name :"+BookName+"BookdId :"+BookId+"Author :"+BookAuthor);
    System.out.println("Book Price: "+price+"Status : "+Status);
   }
   void InquiryBook(){
    System.out.println("Inquiry Successful");
   }
}

class Librarian{
    static int Id; static String Name;
    Librarian(int Id, String Name){
       this.Id=Id; this.Name=Name;
    }

   void SearchBook(String Name){
    System.out.println("The Book"+Name+" found");
}
   void OrderBooks(){
    System.out.println("Order Successful");
}
   void  VerifyMember(int Id){
      System.out.println("Id is"+Id);
   }
   void SellBooks(){
    System.out.println("Books can not be sold");
   }
}

class Publisher{
    static int Id; static String Name;
    static String Adress; static int PhoneNo;
    Publisher(int Id,String Name,String Adress,int PhoneNo){
        this.Id=Id; this.Name=Name;
        this.Adress=Adress; this.PhoneNo=PhoneNo;
    }
   void Addpub(){
    System.out.println("Publisher Added");
   }
   void Modifypub(){
    System.out.println("Publisher Modified");
   }
   void Deletepub(){
    System.out.println("Publisher Deleted");
   }
   void OrderStatus(){
    System.out.println("No order for today");
   }
}
 class User{
   static int Id;
   static String Username; static String UserAdress;
   static int phoneNo;
   User(int Id,String Username, String UserAdress, int phoneNo){
     this.Id=Id; this.Username=Username;
     this.UserAdress=UserAdress;this.phoneNo=phoneNo;
   } 
   void ReturnBooks(){
      System.out.println("Return");    
   }
   void Payfine(int date){
      System.out.println("Fined");
   }
   void AddNewUser(){
    System.out.println("New User Added");
   }
   void DeleteUser(){
    System.out.println("User Deleted");
   }
   void UpdateDetails(){
    System.out.println("Details Updated");
   }
   void BookPurchase(){
    System.out.println("Book has been Purchased");
   }
 }
public class Library_system {
    public static void main(String[] args) {
      Books b= new Books(1,"OOp","Hasin","2025",.00f,"Sold");
      Librarian lb =new Librarian(2, "Motin");
      User u=new User(5, "Abdul", "Akhalia", 017);
      b.AddNewBooks();
      b.DisplayBookDetails(2, "OOP", "Hasin", "2025", .9509f,"Sold");
        
    }
}
