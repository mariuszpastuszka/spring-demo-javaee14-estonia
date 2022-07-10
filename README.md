### MVC pattern
- Model (data + operations on data)
- View (views presented to user)
- Controller (handling incoming requests and provides views for clients/users)

### Application architecture with MVC
- View
- Controller
- Model (Service + Repository)

### Application architecture with MVC - second view
- View, presented to user
- Controller (should have reference to Service), handling incoming requests and provides views for clients/users
- Service (should have reference to Repository), processed data
- Repository, stores and provides access to data (eg. database)

### REST API
- for exchanging data in universal format - JSON/XML
- for sharing resources
- CRUD - Create Read Update Delete
- Reservation - it's a resource
- resources should be plural nouns and organized in hierarchical way
- first and second proposal
  - /reservations - for reading all reservations - with GET Http method
  - /reservations/add - for creation of reservation - with POST Http method
  - /deletereservations vs /reservations/delete - for deleting reservation - with DELETE Http method
  - /updatereservation vs /reservations/update - for updating reservation - with PUT Http method
- third proposal - REST principles for good naming of resources
  - /reservations - GET - for Reading all resources (R from CRUD)
  - /reservations/{id} - GET - for Reading for one resource (R from CRUD)
  - /reservations - POST - for Creation (C from CRUD)
  - /reservations/{id} (/reservations/13454455) - DELETE - for Deletion (D from CRUD)
  - /reservations/{id} (/reservations/13454455) - PUT - for Update (full) (U from CRUD)
  - /reservations/{id} (/reservations/13454455) - PATCH - for Update (partial) (U from CRUD)
