# Structure for BMS

## FrontEnd

- Swing
- Pages
  - Login/Creat Account
  - Mainview for manager/customer

  - Customer
    - creat account
      - brand new customer
        - a new login name and password
        - name, date of birth, id, cell phone, address
        - documents need to be sign or check box
        - generate a card number
      - old customer
        - auto fill infos
        - documents
    - main view
      - all account
        - name & balance
        - click will jump to info of this account
      - transactions(could have a filter)
        - transactions
          - data, account name, account, new balance
      - stock
  - Manager
    - transactions, (need a user name)
    - mainly is about filter and statistic data

## BackEnd
  
- Customer
  - hidder id
  - username, password
  - account list
- account
  - card number
  - creat date
  - userid
- transaction
  - hidden id (primary key)
  - card number
  - creat date
  - amount
  - new balance

## Module

- User
  - Customer
  - Manager
- Account
  - Checking
  - Saving
  - Stock
- Trasactions
