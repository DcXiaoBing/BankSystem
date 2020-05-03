# DB design

- Customer
  - id
  - name

- login account
  - id
  - username
  - password
  - userId (foreign key to customer)

- balance
  - id
  - account_id (foreign key to customer)
  - USD
  - CHY
  - EUR

- loan
  - id
  - userId (foreign key to customer)
  - total amount
  - rest amount
  - intrest
  - monthly pay
  - list of collateral

- collateral
  - id
  - name
  - amount
  - ownerId (foreign key to customer)
  - loanId (foreign key to loan)

- Currency
  - name
  - rate

Maybe combine checking and saving is a good idea

- Deposit Account
  - Checking/Saving Account
    - id (globally unique)
    - type
    - userId (foreign key to customer)
    - nick name
    - one balance
    - list of loans
    - list of transactions
  - Stock Account
    - id
    - userId (foreign key to customer)
    - balance
    - position list
    - stock list

- Transactions
  - id
  - date
  - From Account(foreign key)
  - To Account(foreign key)

- stock
  - Id
  - name
  - latest price?

- Position
  - Id
  - time
  - type (buy/sell)
  - stock_id
  - amount
  - price
