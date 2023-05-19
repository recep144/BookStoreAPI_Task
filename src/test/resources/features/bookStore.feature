@wip
Feature: BookStore Circle

  #Get All Books
  @getAllBooks
  Scenario: Scenario-1
    Given Get all books
    Then Validate that the books are list

    #Add new User
  @addNewUser
  Scenario: Scenario-2
    Given Add new user
    Then Validate that the user is created

    #Generate token
  @generateToken
  Scenario: Scenario-3
    Given Generate Token
    Then  Validate that the token is generated

    #Authorize user
  @authorizeUser
  Scenario: Scenario-4
    Given Authorize User
    Then Validate that the user is authorized

    #Add new book
  @addNewBook
  Scenario: Scenario-5
    Given Add new book to the user
    Then Validate that the book is assigned to the user

    #Get User Information
  @getUserInfo
  Scenario: Scenario-6
    Given Get User Information
    Then Validate that the user information is correct


    @updateBook
  Scenario: Scenario-7
    Given Update first book with the second one
    Then Validate that the book is uodated

      @deleteBook
      Scenario: Scenario-8
        Given Delete book
        Then Validate that the book is deleted