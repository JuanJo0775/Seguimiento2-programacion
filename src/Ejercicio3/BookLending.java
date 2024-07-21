package Ejercicio3;

import java.util.Date;

public class BookLending {

    int bookCode = 22;
    String userCode;
    Date loanDate = new Date();
    Date returnDate;
    String loanStatus = "Available";
    String bookName = "Pepa´s story";

    public BookLending() {

        returnDate = new Date(loanDate.getTime() + (7L * 24 * 60 * 60 * 1000)); // 7 días a partir de loanDate
    }

    public String checkStatus(){
        return loanStatus;
    }

    public void displayDetails(){
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Code: " + bookCode);
        System.out.println("Loan Date: " + loanDate);
        System.out.println("Return Date: " + returnDate);
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "BookLending{" +
                "bookCode=" + bookCode +
                ", userCode='" + userCode + '\'' +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", loanStatus='" + loanStatus + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
