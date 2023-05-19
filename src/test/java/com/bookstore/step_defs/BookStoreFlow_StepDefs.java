package com.bookstore.step_defs;

import com.bookstore.services.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BookStoreFlow_StepDefs {

    GetAllBooks getAllBooks = new GetAllBooks();
    AddNewUser addNewUser = new AddNewUser();
    GenerateToken generateTokenn = new GenerateToken();
    AuthorizeUser authorizeUser = new AuthorizeUser();
    AddNewBook addNewBook_ = new AddNewBook();
    GetUserInfo getUserInfo = new GetUserInfo();
    UpdateBook updateBook = new UpdateBook();
    DeleteBook deleteBook = new DeleteBook();

    @Given("Get all books")
    public void get_all_books() {
        getAllBooks.getAllBooks();

        // throw new io.cucumber.java.PendingException();
    }

    @Then("Validate that the books are list")
    public void validate_that_the_books_are_list() {
        getAllBooks.validateThatAllBooksAreListed();
        // throw new io.cucumber.java.PendingException();
    }

    @Given("Add new user")
    public void add_new_user() {
        addNewUser.addNewUser();
        //throw new io.cucumber.java.PendingException();
    }

    @Then("Validate that the user is created")
    public void validate_that_the_user_is_created() {
        addNewUser.validateThatUserIsAdded();
        // throw new io.cucumber.java.PendingException();
    }


    @Given("Generate Token")
    public void generate_Token() {
        generateTokenn.generateToken();
        //throw new io.cucumber.java.PendingException();
    }

    @Then("Validate that the token is generated")
    public void validate_that_the_token_is_generated() {
        generateTokenn.validateThatTheTokenIsGenerated();
        // throw new io.cucumber.java.PendingException();
    }


    @Given("Authorize User")
    public void authorize_User() {
        authorizeUser.authorizeUser();
        //  throw new io.cucumber.java.PendingException();
    }

    @Then("Validate that the user is authorized")
    public void validate_that_the_user_is_authorized() {
        authorizeUser.validateThatUserIsAuthorized();
        // throw new io.cucumber.java.PendingException();
    }

    @Given("Add new book to the user")
    public void add_new_book_to_the_user() {
        addNewBook_.addNewBook();
        // throw new io.cucumber.java.PendingException();
    }

    @Then("Validate that the book is assigned to the user")
    public void validate_that_the_book_is_assigned_to_the_user() {
        addNewBook_.validateThatTheBookAssgnedToTheUser();
        //throw new io.cucumber.java.PendingException();
    }

    @Given("Get User Information")
    public void get_User_Information() {
        getUserInfo.getUserInformation();
        // throw new io.cucumber.java.PendingException();
    }

    @Then("Validate that the user information is correct")
    public void validate_that_the_user_information_is_correct() {
        getUserInfo.validateThatUserInformationIsCorrect();
        //  throw new io.cucumber.java.PendingException();
    }

    @Given("Update first book with the second one")
    public void update_first_book_with_the_second_one() {
        updateBook.updateBookNumber();
        //  throw new io.cucumber.java.PendingException();
    }

    @Then("Validate that the book is uodated")
    public void validate_that_the_book_is_uodated() {
        updateBook.validateThatTheBookIsUpdated();
        //throw new io.cucumber.java.PendingException();
    }

    @Given("Delete book")
    public void delete_book() {
       deleteBook.deleteFirstBook();
        //throw new io.cucumber.java.PendingException();
    }

    @Then("Validate that the book is deleted")
    public void validate_that_the_book_is_deleted() {
       deleteBook.validateThatTheBookIsDeleted();
      //  throw new io.cucumber.java.PendingException();
    }


}
