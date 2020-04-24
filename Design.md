# Design

## Frontend

- Page Design
- Structure design

## Pipline

- Possible Technique
  - XML, JSON
    - Pro
      - easy to use
    - Con
      - Low performence when do query
  - MySQL -> JDBC
    - Pro
      - High performence
      - good experience
    - Con
      - Cannot run on a machine without mysql

- Provide Interface for frontend
- Read Data
- Write Data

## Data Model

- User
  - Manager
  - Customer

- Account
  - checking
  - saving
    - Medthod
      - getIntrest
        - So you can keep it simple and calculate the interest on the balance of the day you calculate the interest!!
  - stock (security)

- Transaction

- Collateral
  - name(String is ok)
  - amount
  - value

- Concurrency
  - exchange rate (set by manager)
