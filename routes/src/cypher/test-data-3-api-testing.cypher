// ----------------------------------------------------------------------------
// Test Domain 3 - For purposes of API testing
// ----------------------------------------------------------------------------

CREATE (domain:Domain {
    name: "Test 3",
    uuid: "7e0ec1fb-6a73-4128-b234-8b4f8318ac33"});

// ----------------------------------------------------------------------------
// Test3 Customer 1
// ----------------------------------------------------------------------------

MATCH (domain:Domain {uuid: "7e0ec1fb-6a73-4128-b234-8b4f8318ac33"})
CREATE (domain)-[:SUPPLIES]->(:Customer {
    name: "Test3 Alpha Ltd",
    uuid: "7c8399d4-bf24-49cf-a403-312a8e57f30b"});

// ----------------------------------------------------------------------------
// Test3 Sites
// ----------------------------------------------------------------------------

MATCH (customer:Customer {uuid: "7c8399d4-bf24-49cf-a403-312a8e57f30b"})
CREATE (customer)-[:OWNS]->(:Site {
    name: "Alpha",
    uuid: "d7139eab-ef77-4acc-9775-c3fd5f024e7b"})

// ----------------------------------------------------------------------------
// Test3 Ltd Main Route
// ----------------------------------------------------------------------------

MATCH (site:Site {uuid: "d7139eab-ef77-4acc-9775-c3fd5f024e7b"})
CREATE (site)-[:ROUTE]->(:Machine {
    location: "Reception",
    name: "Alpha Machine 1",
    uuid: "60375660-6402-469c-818e-354adad75ce3"});

MATCH (machine:Machine {uuid: "60375660-6402-469c-818e-354adad75ce3"})
CREATE (machine)-[:ROUTE]->(:Machine {
    location: "First floor by the lifts",
    name: "Alpha Machine 2",
    uuid: "dff2648e-6224-4208-9023-d4230c034d69"});

// ----------------------------------------------------------------------------
// Test3 Customer 2
// ----------------------------------------------------------------------------

MATCH (domain:Domain {uuid: "7e0ec1fb-6a73-4128-b234-8b4f8318ac33"})
CREATE (domain)-[:SUPPLIES]->(:Customer {
    name: "Test3 Bravo Ltd",
    uuid: "29830520-9166-42e4-b124-b7138dc9453e"});