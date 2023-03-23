// ----------------------------------------------------------------------------
// Test Domain 1 - Customer with more than one 'home' node
// ----------------------------------------------------------------------------

CREATE (domain:Domain {
    name: "Test 1",
    uuid: "a6e3f112-36c6-41fd-91f6-ae7ce451dbb3"});

// ----------------------------------------------------------------------------
// Test1 Ltd Customer
// ----------------------------------------------------------------------------

MATCH (domain:Domain {uuid: "a6e3f112-36c6-41fd-91f6-ae7ce451dbb3"})
CREATE (domain)-[:SUPPLIES]->(:Customer {
    name: "Test1 Ltd",
    uuid: "5a493f4a-9681-4f43-9290-2a61cfe5b083"});

// ----------------------------------------------------------------------------
// Test1 Ltd Sites
// ----------------------------------------------------------------------------

MATCH (customer:Customer {uuid: "5a493f4a-9681-4f43-9290-2a61cfe5b083"})
CREATE (customer)-[:OWNS]->(:Site {
    name: "Alpha",
    uuid: "d7139eab-ef77-4acc-9775-c3fd5f024e7b"})

// ----------------------------------------------------------------------------
// Test1 Ltd Main Route - Attempt two machines
// ----------------------------------------------------------------------------

MATCH (site:Site {uuid: "d7139eab-ef77-4acc-9775-c3fd5f024e7b"})
CREATE (site)-[:ROUTE]->(:Machine {
    location: "Reception",
    name: "Alpha Machine 1",
    uuid: "60375660-6402-469c-818e-354adad75ce3"});

MATCH (site:Site {uuid: "d7139eab-ef77-4acc-9775-c3fd5f024e7b"})
CREATE (site)-[:ROUTE]->(:Machine {
    location: "Reception",
    name: "Alpha Machine 2",
    uuid: "1749e065-dc93-419f-9a4e-d68bc920c35e"});