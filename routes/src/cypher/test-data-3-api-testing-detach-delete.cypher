// ----------------------------------------------------------------------------
// Detach & Delete the Test3 Domain
// ----------------------------------------------------------------------------

MATCH (domain:Domain {uuid: "7e0ec1fb-6a73-4128-b234-8b4f8318ac33"})-[*]->(n)
DETACH DELETE domain, n;