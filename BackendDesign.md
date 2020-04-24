#

## Class Design

- User
  - Manager
  - Customer
- LoginAccount
  - DATA MEMBER
    - user name
    - password
    - email - optional

- Account
  - data Members
    - int ID (even different type account cannot have same id)
  - Abstract method
    - double getBalance()
    - Account creatAccount()
  - subclasses
    - DepositAccount
      - data members
        - balance. Do we need another class to handle this?
        - list of loan
        - list of transactions
      - method
        - tranfer
        - withdraw
        - exchange currency
        - requestLoan
        - repayLoan
      - subclass
        - CheckingAccount
        - SavingAccount
          - methods
            - getIntrest
              - calculate the interest on the balance of the day you calculate the interest
    - StockAccount
      - balance
      - list of stock in account
      - selling list
      - buying list

- DatabaseManager
  - DataReader
  - DataWriter

- Transaction
  - DATA MEMBER
    - id
    - creat date
    - account

- Loan
  - DATA MEMBER
    - id
    - monthly repay
    - rest amount
    - List of collateral

- Collateral
  - DATA MEMBER
    - id
    - name(String is ok)
    - amount
    - value

- Currency
  - Data Member
    - exchange rate to a basic currency(eg. gold, dollar)
    - exchange rate
  - Method
    - exchange(Currency c, double amout) return exchange amount

- Stock
  - DATA MEMBER
    - id
    - price
    - amount
- StockPosition
  - DATAMEMBER
    - stock
    - owner account id

## Design Pattern

- Design pattern we learn in class
  - Structural Pattern
    - Adapter
    - Decorator
    - Proxy (Can be use to control access. Protection proxy)
  - Creational Patterns
    - Factory Method
    - Abstract Factory
    - Singleton
  - Behavioral Patterns
    - Iterator
    - Observer
    - Strategy

## Operation flow

### customer

- Login
- MainView
  - open/close account
    - checking / saving / stock
      - can have multiple account
      - need to satisfy certain condition for stock account
  - view account
    - query transaction
    - query summary
      - balance, bill etc.
  - operation on checking/saving
    - withdrawal
    - make transaction
      - difference between saving and checking?
    - exchange currency
    - loan
      - request
        - need to record collateral
      - repay

### Manager

- Login
